import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
public class class227 {
	@ObfuscatedName("at")
	final int[][] field2403;
	@ObfuscatedName("ah")
	final int[][] field2399;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -793547525
	)
	int field2400;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -354000603
	)
	int field2401;
	@ObfuscatedName("ab")
	final int[] field2402;
	@ObfuscatedName("au")
	final int[] field2404;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 2049771567
	)
	final int field2398;

	class227(int var1, int var2) {
		this.field2403 = new int[var1][var2]; // L: 15
		this.field2399 = new int[var1][var2]; // L: 16
		int var3 = var2 * var1; // L: 17
		int var4 = class184.method3680(var3 / 4); // L: 18
		this.field2402 = new int[var4]; // L: 19
		this.field2404 = new int[var4]; // L: 20
		this.field2398 = var4 - 1; // L: 21
	} // L: 22

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1222193481"
	)
	void method4396() {
		for (int var1 = 0; var1 < this.field2403.length; ++var1) { // L: 25
			for (int var2 = 0; var2 < this.field2403[var1].length; ++var2) { // L: 26
				this.field2403[var1][var2] = 0; // L: 27
				this.field2399[var1][var2] = 99999999; // L: 28
			}
		}

	} // L: 31

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "19"
	)
	void method4397(int var1, int var2) {
		this.field2400 = var1; // L: 34
		this.field2401 = var2; // L: 35
	} // L: 36

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "40323441"
	)
	int method4409() {
		return this.field2400; // L: 39
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1750478119"
	)
	int method4399() {
		return this.field2401; // L: 43
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1487241351"
	)
	int method4400() {
		return this.field2403.length; // L: 47
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-63"
	)
	int method4401() {
		return this.field2403[0].length; // L: 51
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "-32547244"
	)
	int[][] method4402() {
		return this.field2403; // L: 55
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "2082106732"
	)
	int[][] method4403() {
		return this.field2399; // L: 59
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-33"
	)
	int[] method4423() {
		return this.field2402; // L: 63
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1805149245"
	)
	int[] method4405() {
		return this.field2404; // L: 67
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "3128"
	)
	int method4428() {
		return this.field2398; // L: 71
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "516019890"
	)
	public static void method4406() {
		synchronized(ArchiveDiskActionHandler.field4272) { // L: 91
			if (ArchiveDiskActionHandler.field4271 != 0) { // L: 92
				ArchiveDiskActionHandler.field4271 = 1; // L: 93
				ArchiveDiskActionHandler.field4274 = true; // L: 94

				try {
					ArchiveDiskActionHandler.field4272.wait(); // L: 96
				} catch (InterruptedException var3) { // L: 98
				}
			}

		}
	} // L: 101

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)Lnn;",
		garbageValue = "16221133"
	)
	static Widget method4434(Widget var0) {
		int var2 = class361.getWidgetFlags(var0); // L: 12755
		int var1 = var2 >> 17 & 7; // L: 12757
		int var3 = var1; // L: 12759
		if (var1 == 0) { // L: 12760
			return null;
		} else {
			for (int var4 = 0; var4 < var3; ++var4) { // L: 12761
				var0 = HealthBarDefinition.field1877.method6285(var0.parentId); // L: 12762
				if (var0 == null) { // L: 12763
					return null;
				}
			}

			return var0; // L: 12765
		}
	}
}
