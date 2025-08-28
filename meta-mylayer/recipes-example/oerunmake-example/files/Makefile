# Compiler Flags
CC := ${CC}
CFLAGS := ${CFLAGS}

#Source Files
MATH_LIB_SRC := adv-math-lib.c
CALC_SRC := adv-calculator.c

#Object Files
MATH_LIB_OBJ := adv-math-lib.o
CALC_OBJ := adv-calculator_inter.o

#Binary Output
TARGET := adv-calculator
TARGET ?= ''

all: $(TARGET)

$(TARGET): $(MATH_LIB_OBJ) $(CALC_OBJ)
	$(CC) $(CFLAGS) $(LDFLAGS) $^ -o $@ -Wl,--hash-style=gnu

$(MATH_LIB_OBJ): $(MATH_LIB_SRC)
	$(CC) $(CFLAGS) -c $< -o $@

$(CALC_OBJ): $(CALC_SRC)
	$(CC) $(CFLAGS) -c $< -o $@

install:
	install -d ${DESTDIR}${BINDIR}
	install -m 0755 ${TARGET} ${DESTDIR}${BINDIR}

clean:
	rm -f $(MATH_LIB_OBJ)  $(CALC_OBJ) $(TARGET)