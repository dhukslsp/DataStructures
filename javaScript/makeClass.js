class areasquare{
	constructor(height,width){
		this.height = height;
		this.width = width;
	}
	area(){
		return this.height * this.width;
	}
}

const myarea = new areasquare(12,34)
console.log(myarea.area());