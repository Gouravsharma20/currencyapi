package domain.model




data class ApiResponse(
    val meta:MetaData,
    val data:Map<String,Currency>
)

data class MetaData (
    val lastUpdatedAt: String
)
data class Currency (
    val code:String,
    val value:Double
)