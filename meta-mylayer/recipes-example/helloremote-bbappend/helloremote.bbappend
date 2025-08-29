FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " file://0002-patch-example.patch"
do_configure:append() {
    sed -i '2a\#define DEBUG_FLAG 0' helloworld.h
}