import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qt")
public class class421 extends class422 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	class331 field4592;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 790629697
	)
	int field4593;

	@ObfuscatedSignature(
		descriptor = "(Lqd;IZI)V"
	)
	public class421(class422 var1, int var2, boolean var3, int var4) {
		super(var1); // L: 11
		this.field4592 = null; // L: 7
		this.field4593 = 0; // L: 8
		super.field4597 = "FadeInTask"; // L: 12
		if (var2 >= 0) { // L: 13
			if (var3 && var2 < class319.field3461.size()) { // L: 16
				this.field4592 = (class331)class319.field3461.get(var2); // L: 17
			} else if (!var3 && var2 < class319.field3459.size()) { // L: 19
				this.field4592 = (class331)class319.field3459.get(var2); // L: 20
			}

			this.field4593 = var4; // L: 22
		}
	} // L: 14 23

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2012801823"
	)
	public boolean vmethod7975() {
		if (this.field4592 != null && this.field4592.field3582 != null) { // L: 27
			this.field4592.field3580 = true; // L: 30

			try {
				if (this.field4592.field3576 < (float)this.field4592.field3577 && this.field4592.field3582.isReady()) { // L: 32
					float var1 = this.field4593 == 0 ? (float)this.field4593 : (float)this.field4592.field3577 / (float)this.field4593; // L: 33
					class331 var10000 = this.field4592;
					var10000.field3576 += 0.0F == var1 ? (float)this.field4592.field3577 : var1; // L: 34
					if (this.field4592.field3576 > (float)this.field4592.field3577) { // L: 35
						this.field4592.field3576 = (float)this.field4592.field3577; // L: 36
					}

					this.field4592.field3582.setPcmStreamVolume((int)this.field4592.field3576); // L: 38
					return false; // L: 39
				}
			} catch (Exception var3) { // L: 42
				this.method7954(var3.getMessage()); // L: 43
				return true; // L: 44
			}

			this.field4592.field3580 = false; // L: 46
			return true; // L: 47
		} else {
			return true; // L: 28
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "431023974"
	)
	static int method7948(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 574
		Widget var4;
		if (var0 >= 2000) { // L: 576
			var0 -= 1000; // L: 577
			var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 578
			var4 = class380.field4414.method6348(var3); // L: 579
		} else {
			var4 = var2 ? class31.scriptDotWidget : class185.field1932; // L: 581
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 582
			UserComparator6.Interpreter_intStackSize -= 4; // L: 583
			var4.rawX = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 584
			var4.rawY = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 585
			var4.xAlignment = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 586
			var4.yAlignment = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 3]; // L: 587
			FaceNormal.invalidateWidget(var4); // L: 588
			VertexNormal.client.alignWidget(var4); // L: 589
			if (var3 != -1 && var4.type == 0) { // L: 590
				class16.revalidateWidgetScroll(class380.field4414.field3610[var3 >> 16], var4, false);
			}

			return 1; // L: 591
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 593
			UserComparator6.Interpreter_intStackSize -= 4; // L: 594
			var4.rawWidth = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 595
			var4.rawHeight = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 596
			var4.widthAlignment = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 597
			var4.heightAlignment = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 3]; // L: 598
			FaceNormal.invalidateWidget(var4); // L: 599
			VertexNormal.client.alignWidget(var4); // L: 600
			if (var3 != -1 && var4.type == 0) { // L: 601
				class16.revalidateWidgetScroll(class380.field4414.field3610[var3 >> 16], var4, false);
			}

			return 1; // L: 602
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 604
			boolean var5 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 605
			if (var5 != var4.isHidden) { // L: 606
				var4.isHidden = var5; // L: 607
				FaceNormal.invalidateWidget(var4); // L: 608
			}

			return 1; // L: 610
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 612
			var4.noClickThrough = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 613
			return 1; // L: 614
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 616
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 617
			return 1; // L: 618
		} else {
			return 2; // L: 620
		}
	}
}
