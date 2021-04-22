(defproject project1 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [com.cognitect.aws/api "0.8.505"]
                 [com.cognitect.aws/endpoints "1.1.11.976"]
                 [com.cognitect.aws/s3 "811.2.865.0"]
                 [com.cognitect.aws/dynamodb "746.2.533.0"]
                 [com.cognitect.aws/ec2 "759.2.556.0"]
                 [com.cognitect.aws/endpoints "1.1.11.664"]
                 [com.cognitect.aws/logs "747.2.533.0"]
                 [com.cognitect.aws/autoscaling "770.2.568.0"]
                 [com.cognitect.aws/cloudformation "746.2.533.0"]
                 [com.cognitect.aws/s3 "762.2.558.0"]
                 [com.cognitect.aws/resourcegroupstaggingapi "747.2.533.0"]
                 [com.cognitect.aws/lambda "811.2.865.0"]
                 [com.cognitect.aws/iam "811.2.889.0"]
                 [ com.cognitect.aws/kms "811.2.834.0"]]
  :repl-options {:init-ns project1.core})