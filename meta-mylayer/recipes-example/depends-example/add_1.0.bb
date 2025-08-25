SUMMARY = "Copies Bash Script in /usr/bin"

LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "file://math_lib.c \
           file://add_${PV}.c " 

S = "${WORKDIR}"
PROVIDES = "libmath"


do_compile(){
    ${CC} ${CFLAGS} -c math_lib.c -o math_lib.o
    ar rcs libmath.a math_lib.o

    ${CC} ${FLAGS} -c add_${PV}.c -o add_inter.o
    ${CC} ${FLAGS} ${LDFLAGS} math_lib.o add_inter.o -o add -Wl,--hash-style=gnu
}

do_install(){

    install -d ${D}${libdir}
    install -m 0644 libmath.a ${D}${libdir}

    install -d ${D}${bindir}
    install -m 0755 add ${D}${bindir}/
}
