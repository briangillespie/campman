package campman

class DiceRollerController {

    def index() { 
		def die = [2,4,6,8,10,12,20].collect {
			"d$it"
		}
		[
			title: 'Dice Roller!',
			die  : die,
		]
	}
}
