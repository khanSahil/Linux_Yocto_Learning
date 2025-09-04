# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/khanSahil/factorial.git;protocol=https;branch=master \
           file://0001-Added-the-user-input-feature.patch \
           "

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "5913afb997dcd4356ecaa86f3adfdea3050044da"

S = "${WORKDIR}/git"

# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.

EXTRA_OEMAKE = "PREFIX=${D}${bindir} CC='${CC}' CFLAGS='${CFLAGS} -Wl,--hash-style=gnu'"

do_compile () {
	# You will almost certainly need to add additional arguments here
	oe_runmake
}

do_install () {
	# This is a guess; additional arguments may be required
	install -d ${D}${bindir}
	oe_runmake install
}


