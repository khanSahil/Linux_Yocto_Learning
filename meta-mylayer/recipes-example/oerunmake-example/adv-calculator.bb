SUMMARY = "Simple Calculator Application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "file://adv-calculator.c \
           file://adv-math-lib.c \
           file://Makefile \
          " 


S = "${WORKDIR}"

do_compile(){
#    ${CC} ${CFLAGS} -c adv-math-lib.c -o adv-math-lib.o
#    ${CC} ${FLAGS} -c adv-calculator.c -o adv-calculator.o
#    ${CC} ${FLAGS} ${LDFLAGS} adv-math-lib.o adv-calculator.o -o adv-calculator -Wl,--hash-style=gnu
    oe_runmake
}

do_install(){
#    install -d ${D}${bindir}
#    install -m 0755 ${S}/adv-calculator ${D}${bindir}
    oe_runmake install DESTDIR=${D} BINDIR=${bindir}
}
