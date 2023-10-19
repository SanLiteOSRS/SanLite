import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 782417661
	)
	static int field1312;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lhj;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque(); // L: 12
		this.definition = var1; // L: 15
	} // L: 16

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-495031119"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null; // L: 19
		int var6 = 0; // L: 20

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) { // L: 21
			++var6; // L: 22
			if (var7.cycle == var1) { // L: 23
				var7.set(var1, var2, var3, var4); // L: 24
				return; // L: 25
			}

			if (var7.cycle <= var1) { // L: 27
				var5 = var7;
			}
		}

		if (var5 == null) {
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Ldt;",
		garbageValue = "-24"
	)
	@Export("getInventorySprite")
	HealthBarUpdate getInventorySprite(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last(); // L: 38
		if (var2 != null && var2.cycle <= var1) { // L: 39
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) { // L: 40 41
				var2.remove(); // L: 42
				var2 = var3; // L: 43
			}

			if (this.definition.int5 + var2.cycle + var2.cycleOffset > var1) { // L: 47
				return var2;
			} else {
				var2.remove(); // L: 49
				return null; // L: 50
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1212431293"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method7247(); // L: 55
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "-21237"
	)
	public static int method2618(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383; // L: 29
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1762849549"
	)
	public static int method2616(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0]; // L: 65
		int var1 = (int)(var2 >>> 0 & 127L); // L: 67
		return var1; // L: 69
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "28917"
	)
	public static int method2619(int var0) {
		return (var0 & class523.field5093) - 1; // L: 26
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lul;IB)V",
		garbageValue = "1"
	)
	public static void method2617(Buffer var0, int var1) {
		if (JagexCache.JagexCache_randomDat != null) { // L: 342
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 344
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 345
			} catch (Exception var3) { // L: 347
			}
		}

	} // L: 349

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "516067263"
	)
	public static void method2615() {
		try {
			JagexCache.JagexCache_dat2File.close(); // L: 353

			for (int var0 = 0; var0 < UrlRequester.idxCount; ++var0) { // L: 354
				UserComparator8.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 355
			JagexCache.JagexCache_randomDat.close(); // L: 356
		} catch (Exception var2) { // L: 358
		}

	} // L: 359
}
