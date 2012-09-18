require ${BPN}.inc

#DEFAULT_PREFERENCE = "-1"

SRCREV = "de43b72379b469567454b96d03a56bf813913475"
PV = "0.2.0+gitr${SRCPV}"

SAMSUNGIPC_BRANCH ?= "master"
SRC_URI = "git://github.com/morphis/libsamsung-ipc.git;protocol=git;branch=${SAMSUNGIPC_BRANCH}"
S = "${WORKDIR}/git"
