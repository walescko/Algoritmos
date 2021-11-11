# This file is part of the LibreOffice project.
#
# This Source Code Form is subject to the terms of the Mozilla Public
# License, v. 2.0. If a copy of the MPL was not distributed with this
# file, You can obtain one at http://mozilla.org/MPL/2.0/.
#

$(eval $(call 	gb_UITest_UITest,writer_tests2))

$(eval $(call gb_UITest_add_modules,writer_tests2,$(SRCDIR)/sw/qa/uitest,\
	writer_tests2/ \
))

$(eval $(call gb_UITest_set_defs,writer_tests2, \
    TDOC="$(SRCDIR)/sw/qa/uitest/data" \
))
