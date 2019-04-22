# RoomObservableApp
Build failure with Observable

error: no suitable method found for createObservable(RoomDatabase,boolean,String[],<anonymous Callable<List<Item>>>)
method RxRoom.createObservable(RoomDatabase,String...) is not applicable
(varargs mismatch; boolean cannot be converted to String)
method RxRoom.<T>createObservable(RoomDatabase,String[],Callable<T>) is not applicable
(cannot infer type-variable(s) T
(actual and formal argument lists differ in length))
where T is a type-variable:
T extends Object declared in method <T>createObservable(RoomDatabase,String[],Callable<T>)
