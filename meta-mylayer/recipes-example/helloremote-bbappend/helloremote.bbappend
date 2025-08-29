do_configure:append() {
    sed -i '2a\#define DEBUG_FLAG 0' helloworld.h
}