(ns project1.core)


;; make a client
(require '[cognitect.aws.client.api :as aws]
         '[cognitect.aws.credentials :as credentials]
         '[cognitect.aws.region :as regions])


(def iam (aws/client {:api :iam
                      :credentials-provider (credentials/basic-credentials-provider
                                              {:access-key-id     "AKIATDGHMRLCLPUE6ZEO"
                                               :secret-access-key "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"})
                      :region-provider :eu-north-1}))


(->> (aws/invoke iam {:op :ListRoles}) :Roles (map :RoleName))
(aws/invoke iam {:op :GetUser})

(def kms (aws/client {:api                  :kms
                      :credentials-provider (credentials/basic-credentials-provider
                                              {:access-key-id     "AKIATDGHMRLCLPUE6ZEO"
                                               :secret-access-key "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"})}))

(def provider (:credentials-provider kms))

(def s3 (aws/client {:api :s3 :credentials-provider (credentials/basic-credentials-provider
                                                      {:access-key-id     "AKIATDGHMRLCLPUE6ZEO"
                                                       :secret-access-key "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"})}))
(aws/invoke s3 {:op :GetUser :request {:UserName (:UserName me)}})
(aws/invoke s3 {:op :ListBuckets})
;; http-request and http-response are in the metadata
(meta *1)

;; create a bucket in the same region as the client
(aws/invoke s3 {:op :CreateBucket :request {:Bucket "my-unique-bucket-name"}})