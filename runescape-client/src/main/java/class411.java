import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pa")
public final class class411 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	public static Buffer field4561;
	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "[Ltj;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("at")
	final Comparator field4555;
	@ObfuscatedName("an")
	final Map field4554;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	final class390 field4556;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	final class390 field4562;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = 5730875191592967521L
	)
	final long field4557;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	final class409 field4559;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -473904781
	)
	final int field4560;

	@ObfuscatedSignature(
		descriptor = "(JILpo;)V"
	)
	class411(long var1, int var3, class409 var4) {
		this.field4555 = new class410(this); // L: 7
		this.field4557 = var1; // L: 34
		this.field4560 = var3; // L: 35
		this.field4559 = var4; // L: 36
		if (this.field4560 == -1) { // L: 37
			this.field4554 = new HashMap(64); // L: 38
			this.field4556 = new class390(64, this.field4555); // L: 39
			this.field4562 = null; // L: 40
		} else {
			if (this.field4559 == null) { // L: 43
				throw new IllegalArgumentException("");
			}

			this.field4554 = new HashMap(this.field4560); // L: 44
			this.field4556 = new class390(this.field4560, this.field4555); // L: 45
			this.field4562 = new class390(this.field4560); // L: 46
		}

	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(ILpo;)V"
	)
	public class411(int var1, class409 var2) {
		this(-1L, var1, var2); // L: 30
	} // L: 31

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "5"
	)
	boolean method7702() {
		return this.field4560 != -1; // L: 51
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)Ljava/lang/Object;",
		garbageValue = "64"
	)
	public Object method7714(Object var1) {
		synchronized(this) { // L: 55
			if (this.field4557 != -1L) { // L: 56
				this.method7698();
			}

			class412 var3 = (class412)this.field4554.get(var1); // L: 57
			if (var3 == null) { // L: 58
				return null;
			} else {
				this.method7697(var3, false); // L: 59
				return var3.field4568; // L: 60
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-912325832"
	)
	public Object method7696(Object var1, Object var2) {
		synchronized(this) { // L: 65
			if (-1L != this.field4557) { // L: 66
				this.method7698();
			}

			class412 var4 = (class412)this.field4554.get(var1); // L: 67
			if (var4 != null) { // L: 68
				Object var8 = var4.field4568; // L: 69
				var4.field4568 = var2; // L: 70
				this.method7697(var4, false); // L: 71
				return var8; // L: 72
			} else {
				class412 var5;
				if (this.method7702() && this.field4554.size() == this.field4560) { // L: 74
					var5 = (class412)this.field4562.remove(); // L: 75
					this.field4554.remove(var5.field4565); // L: 76
					this.field4556.remove(var5); // L: 77
				}

				var5 = new class412(var2, var1); // L: 79
				this.field4554.put(var1, var5); // L: 80
				this.method7697(var5, true); // L: 81
				return null; // L: 82
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lpl;ZI)V",
		garbageValue = "1046983441"
	)
	void method7697(class412 var1, boolean var2) {
		if (!var2) { // L: 88
			this.field4556.remove(var1); // L: 89
			if (this.method7702() && !this.field4562.remove(var1)) { // L: 90 91
				throw new IllegalStateException("");
			}
		}

		var1.field4566 = System.currentTimeMillis(); // L: 94
		if (this.method7702()) { // L: 95
			switch(this.field4559.field4547) { // L: 96
			case 0:
				var1.field4567 = var1.field4566; // L: 98
				break;
			case 1:
				++var1.field4567; // L: 101
			}

			this.field4562.add(var1); // L: 104
		}

		this.field4556.add(var1); // L: 106
	} // L: 107

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1302993444"
	)
	void method7698() {
		if (-1L == this.field4557) { // L: 111
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4557; // L: 112

			while (!this.field4556.isEmpty()) { // L: 113
				class412 var3 = (class412)this.field4556.peek(); // L: 114
				if (var3.field4566 >= var1) { // L: 115
					return; // L: 120
				}

				this.field4554.remove(var3.field4565); // L: 116
				this.field4556.remove(var3); // L: 117
				if (this.method7702()) { // L: 118
					this.field4562.remove(var3);
				}
			}

		}
	} // L: 122

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1566724339"
	)
	public void method7699() {
		synchronized(this) { // L: 125
			this.field4554.clear(); // L: 126
			this.field4556.clear(); // L: 127
			if (this.method7702()) { // L: 128
				this.field4562.clear();
			}

		}
	} // L: 130

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "2015351615"
	)
	static int method7695(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class53.scriptDotWidget : Interpreter.field864; // L: 1326
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1327
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x; // L: 1328
			return 1; // L: 1329
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1331
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y; // L: 1332
			return 1; // L: 1333
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1335
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width; // L: 1336
			return 1; // L: 1337
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1339
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height; // L: 1340
			return 1; // L: 1341
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1343
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1344
			return 1; // L: 1345
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1347
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId; // L: 1348
			return 1; // L: 1349
		} else {
			return 2; // L: 1351
		}
	}
}
