SUMMARY = "Hello World Remote program"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "git://github.com/khanSahil/C_Programs.git;protocol=https;branch=master"
SRCREV = "50d990d7fdfb59ccca02ab383f7f5c8f9739c194" 

#SRC_URI:append = " file://0001-patch-example.patch"

S = "${WORKDIR}/git/do_fetch_tutorial"

do_configure(){
    sed -i '1a\#define DEBUG_FLAG 1' helloworld.h
}

do_compile() {
    ${CC} ${CFLAGS} ${LDFLAGS} ${S}/helloworld.c -o helloremote
}

do_install(){
    install -d ${D}${bindir}
    install -m 0755 ${S}/helloremote ${D}${bindir}/
}
