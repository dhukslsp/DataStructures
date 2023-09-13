class EMployee {
	id: number;
	name: String;
	constructor(id:number){
		this.id = id;
	}
}



let john = new EMployee(132);
console.log(john.id)