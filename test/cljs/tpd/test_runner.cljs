(ns tpd.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [tpd.core-test]
   [tpd.common-test]))

(enable-console-print!)

(doo-tests 'tpd.core-test
           'tpd.common-test)
