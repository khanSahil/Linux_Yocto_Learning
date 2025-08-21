SUMMARY = "Copies Bash Script in /usr/bin"

LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "file://helloworld.sh" 

S = "${WORKDIR}"

RDEPENDS:${PN} = "bash libfoo"

do_install(){
    install -d ${D}${bindir}
    install -m 0755 ${S}/helloworld.sh ${D}${bindir}/
}
