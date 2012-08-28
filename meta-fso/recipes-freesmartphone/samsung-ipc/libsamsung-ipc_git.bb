require ${BPN}.inc

#DEFAULT_PREFERENCE = "-1"

SRCREV = "222f78a5f065cc1c1cbefe77ef96807ea996d0fb"
PV = "0.2.0+gitr${SRCPV}"

SAMSUNGIPC_BRANCH ?= "master"
SRC_URI = "git://github.com/morphis/libsamsung-ipc.git;protocol=git;branch=${SAMSUNGIPC_BRANCH}"
S = "${WORKDIR}/git"
