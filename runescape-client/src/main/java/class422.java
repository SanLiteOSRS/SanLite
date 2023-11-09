import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qx")
public class class422 {
	@ObfuscatedName("aj")
	float field4619;
	@ObfuscatedName("al")
	float field4624;
	@ObfuscatedName("ac")
	float field4615;
	@ObfuscatedName("ab")
	float field4616;
	@ObfuscatedName("an")
	float field4617;
	@ObfuscatedName("ao")
	float field4618;
	@ObfuscatedName("av")
	float field4613;
	@ObfuscatedName("aq")
	float field4620;
	@ObfuscatedName("ap")
	float field4621;
	@ObfuscatedName("ar")
	float field4622;
	@ObfuscatedName("ak")
	float field4614;
	@ObfuscatedName("ax")
	float field4623;

	static {
		new class422();
	} // L: 6

	class422() {
		this.method7903(); // L: 22
	} // L: 23

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1933719764"
	)
	void method7903() {
		this.field4623 = 0.0F; // L: 26
		this.field4614 = 0.0F; // L: 27
		this.field4622 = 0.0F; // L: 28
		this.field4620 = 0.0F; // L: 29
		this.field4613 = 0.0F; // L: 30
		this.field4618 = 0.0F; // L: 31
		this.field4616 = 0.0F; // L: 32
		this.field4615 = 0.0F; // L: 33
		this.field4624 = 0.0F; // L: 34
		this.field4621 = 1.0F; // L: 35
		this.field4617 = 1.0F; // L: 36
		this.field4619 = 1.0F; // L: 37
	} // L: 38

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1117453232"
	)
	void method7904(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 41
		float var3 = (float)Math.sin((double)var1); // L: 42
		float var4 = this.field4624; // L: 43
		float var5 = this.field4617; // L: 44
		float var6 = this.field4620; // L: 45
		float var7 = this.field4614; // L: 46
		this.field4624 = var2 * var4 - this.field4615 * var3; // L: 47
		this.field4615 = var2 * this.field4615 + var4 * var3; // L: 48
		this.field4617 = var2 * var5 - var3 * this.field4618; // L: 49
		this.field4618 = var2 * this.field4618 + var5 * var3; // L: 50
		this.field4620 = var6 * var2 - this.field4621 * var3; // L: 51
		this.field4621 = var6 * var3 + this.field4621 * var2; // L: 52
		this.field4614 = var2 * var7 - var3 * this.field4623; // L: 53
		this.field4623 = var2 * this.field4623 + var7 * var3; // L: 54
	} // L: 55

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1895738714"
	)
	void method7905(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 58
		float var3 = (float)Math.sin((double)var1); // L: 59
		float var4 = this.field4619; // L: 60
		float var5 = this.field4616; // L: 61
		float var6 = this.field4613; // L: 62
		float var7 = this.field4622; // L: 63
		this.field4619 = var2 * var4 + var3 * this.field4615; // L: 64
		this.field4615 = this.field4615 * var2 - var4 * var3; // L: 65
		this.field4616 = var3 * this.field4618 + var5 * var2; // L: 66
		this.field4618 = var2 * this.field4618 - var5 * var3; // L: 67
		this.field4613 = this.field4621 * var3 + var6 * var2; // L: 68
		this.field4621 = var2 * this.field4621 - var6 * var3; // L: 69
		this.field4622 = this.field4623 * var3 + var2 * var7; // L: 70
		this.field4623 = this.field4623 * var2 - var7 * var3; // L: 71
	} // L: 72

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1995207939"
	)
	void method7908(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 75
		float var3 = (float)Math.sin((double)var1); // L: 76
		float var4 = this.field4619; // L: 77
		float var5 = this.field4616; // L: 78
		float var6 = this.field4613; // L: 79
		float var7 = this.field4622; // L: 80
		this.field4619 = var2 * var4 - var3 * this.field4624; // L: 81
		this.field4624 = var3 * var4 + this.field4624 * var2; // L: 82
		this.field4616 = var5 * var2 - this.field4617 * var3; // L: 83
		this.field4617 = var3 * var5 + var2 * this.field4617; // L: 84
		this.field4613 = var6 * var2 - this.field4620 * var3; // L: 85
		this.field4620 = this.field4620 * var2 + var6 * var3; // L: 86
		this.field4622 = var2 * var7 - var3 * this.field4614; // L: 87
		this.field4614 = var7 * var3 + this.field4614 * var2; // L: 88
	} // L: 89

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-446919774"
	)
	void method7913(float var1, float var2, float var3) {
		this.field4622 += var1; // L: 92
		this.field4614 += var2; // L: 93
		this.field4623 += var3; // L: 94
	} // L: 95

	public String toString() {
		return this.field4619 + "," + this.field4616 + "," + this.field4613 + "," + this.field4622 + "\n" + this.field4624 + "," + this.field4617 + "," + this.field4620 + "," + this.field4614 + "\n" + this.field4615 + "," + this.field4618 + "," + this.field4621 + "," + this.field4623; // L: 99
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZB)I",
		garbageValue = "-31"
	)
	static int method7922(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 575
		Widget var4;
		if (var0 >= 2000) { // L: 577
			var0 -= 1000; // L: 578
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 579
			var4 = WorldMapSection1.getWidget(var3); // L: 580
		} else {
			var4 = var2 ? GameObject.scriptDotWidget : SoundSystem.field319; // L: 582
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 583
			Interpreter.Interpreter_intStackSize -= 4; // L: 584
			var4.rawX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 585
			var4.rawY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 586
			var4.xAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 587
			var4.yAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 588
			class69.invalidateWidget(var4); // L: 589
			class392.client.alignWidget(var4); // L: 590
			if (var3 != -1 && var4.type == 0) { // L: 591
				class278.revalidateWidgetScroll(class155.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 592
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 594
			Interpreter.Interpreter_intStackSize -= 4; // L: 595
			var4.rawWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 596
			var4.rawHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 597
			var4.widthAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 598
			var4.heightAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 599
			class69.invalidateWidget(var4); // L: 600
			class392.client.alignWidget(var4); // L: 601
			if (var3 != -1 && var4.type == 0) { // L: 602
				class278.revalidateWidgetScroll(class155.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 603
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 605
			boolean var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 606
			if (var5 != var4.isHidden) { // L: 607
				var4.isHidden = var5; // L: 608
				class69.invalidateWidget(var4); // L: 609
			}

			return 1; // L: 611
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 613
			var4.noClickThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 614
			return 1; // L: 615
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 617
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 618
			return 1; // L: 619
		} else {
			return 2; // L: 621
		}
	}
}
