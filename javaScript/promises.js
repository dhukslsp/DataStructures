const promise = new Promise((resolve,reject)=>{
	let string12 = "geekforgeeks";
	let string2123 = "geekforgeekseeff";
	if(string12 === string2123){
		resolve();
	}
	else{
		throw TypeError("This is a type error");
	}

})

promise.then(()=>{
	console.log("Promise resolved sucessfuly");
}).catch((e)=>{
	console.error(e);
})

