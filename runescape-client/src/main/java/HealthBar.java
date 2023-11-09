import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static Archive field1306;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lfw;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque(); // L: 12
		this.definition = var1; // L: 15
	} // L: 16

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "-24757"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null; // L: 19
		int var6 = 0; // L: 20

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) {
			++var6;
			if (var7.cycle == var1) { // L: 23
				var7.set(var1, var2, var3, var4); // L: 24
				return; // L: 25
			}

			if (var7.cycle <= var1) {
				var5 = var7; // L: 27
			}
		}

		if (var5 == null) { // L: 29
			if (var6 < 4) { // L: 30
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5); // L: 33
			if (var6 >= 4) {
				this.updates.last().remove(); // L: 34
			}

		}
	} // L: 31 35

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Lcu;",
		garbageValue = "-1494424352"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last(); // L: 38
		if (var2 != null && var2.cycle <= var1) { // L: 39
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) { // L: 40 41
				var2.remove(); // L: 42
				var2 = var3; // L: 43
			}

			if (this.definition.int5 + var2.cycleOffset + var2.cycle > var1) {
				return var2;
			} else {
				var2.remove(); // L: 49
				return null; // L: 50
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1047690816"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method6774(); // L: 55
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lly;I)V",
		garbageValue = "784434833"
	)
	public static void method2528(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0; // L: 21
	} // L: 22

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-8692175"
	)
	static void method2526() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 44
			if (var0.obj != null) { // L: 45
				var0.set();
			}
		}

	} // L: 47

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(CII)Ljava/lang/String;",
		garbageValue = "1267412510"
	)
	static String method2525(char var0, int var1) {
		char[] var2 = new char[var1]; // L: 212

		for (int var3 = 0; var3 < var1; ++var3) { // L: 213
			var2[var3] = var0;
		}

		return new String(var2); // L: 214
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "824026775"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (Players.loadInterface(var0)) { // L: 10302
			MouseHandler.field268 = null; // L: 10309
			class34.drawInterface(class71.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 10310
			if (MouseHandler.field268 != null) { // L: 10311
				class34.drawInterface(MouseHandler.field268, -1412584499, var1, var2, var3, var4, class142.field1691, HealthBarDefinition.field1989, var7); // L: 10312
				MouseHandler.field268 = null; // L: 10313
			}

		} else {
			if (var7 != -1) { // L: 10303
				Client.field731[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 10305
					Client.field731[var8] = true;
				}
			}

		}
	} // L: 10307 10315
}
