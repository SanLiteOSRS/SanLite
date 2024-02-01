import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
public class class338 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	AbstractArchive field3616;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	AbstractArchive field3617;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	AbstractArchive field3607;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	AbstractArchive field3608;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	AbstractArchive field3613;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[[Lnn;"
	)
	public Widget[][] field3610;
	@ObfuscatedName("ao")
	Map field3611;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	EvictingDualNodeHashTable field3612;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	EvictingDualNodeHashTable field3606;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	EvictingDualNodeHashTable field3614;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	EvictingDualNodeHashTable field3609;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	class439 field3615;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	class439 field3605;

	@ObfuscatedSignature(
		descriptor = "(Low;Low;Low;Low;Low;)V"
	)
	public class338(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4, AbstractArchive var5) {
		this.field3611 = new HashMap(); // L: 20
		this.field3612 = new EvictingDualNodeHashTable(200); // L: 21
		this.field3606 = new EvictingDualNodeHashTable(50); // L: 22
		this.field3614 = new EvictingDualNodeHashTable(20); // L: 23
		this.field3609 = new EvictingDualNodeHashTable(8); // L: 24
		this.field3615 = new class439(10, class437.field4677); // L: 25
		this.field3605 = new class439(10, class437.field4677); // L: 26
		int var6 = 0; // L: 29
		if (var1 != null) { // L: 30
			this.field3616 = var1; // L: 31
			this.field3607 = var2; // L: 32
			this.field3608 = var3; // L: 33
			this.field3613 = var4; // L: 34
			this.field3617 = var5; // L: 35
			var6 = this.field3616.getGroupCount(); // L: 36
		}

		this.field3610 = new Widget[var6][]; // L: 38
		Skills.field3912 = new boolean[var6]; // L: 39
	} // L: 40

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)Lnn;",
		garbageValue = "108"
	)
	public Widget method6348(int var1) {
		int var2 = var1 >> 16; // L: 43
		int var3 = var1 & 65535; // L: 44
		if (this.field3610[var2] == null || this.field3610[var2][var3] == null) { // L: 45
			boolean var4 = this.method6357(var2); // L: 46
			if (!var4) { // L: 47
				return null;
			}
		}

		return this.field3610[var2][var3]; // L: 49
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)Lnn;",
		garbageValue = "-477809652"
	)
	public Widget method6347(int var1, int var2) {
		Widget var3 = this.method6348(var1); // L: 53
		if (var2 == -1) { // L: 54
			return var3;
		} else {
			return var3 != null && var3.children != null && var2 < var3.children.length ? var3.children[var2] : null; // L: 55 56
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "356565951"
	)
	public boolean method6357(int var1) {
		if (Skills.field3912[var1]) { // L: 60
			return true;
		} else if (!this.field3616.tryLoadGroup(var1)) { // L: 61
			return false;
		} else {
			int var2 = this.field3616.getGroupFileCount(var1); // L: 62
			if (var2 == 0) { // L: 63
				Skills.field3912[var1] = true; // L: 64
				return true; // L: 65
			} else {
				if (this.field3610[var1] == null) { // L: 67
					this.field3610[var1] = new Widget[var2];
				}

				for (int var3 = 0; var3 < var2; ++var3) { // L: 68
					if (this.field3610[var1][var3] == null) { // L: 69
						byte[] var4 = this.field3616.takeFile(var1, var3); // L: 70
						if (var4 != null) { // L: 71
							this.field3610[var1][var3] = new Widget(); // L: 72
							this.field3610[var1][var3].id = var3 + (var1 << 16); // L: 73
							if (var4[0] == -1) { // L: 74
								this.field3610[var1][var3].decode(new Buffer(var4));
							} else {
								this.field3610[var1][var3].decodeLegacy(new Buffer(var4)); // L: 75
							}

							if (this.field3617 != null) { // L: 76
								byte[] var5 = this.field3617.takeFile(var1, var3); // L: 77
								if (var5 != null && var5.length > 0) { // L: 78
									this.field3610[var1][var3].method6690(new Buffer(var5)); // L: 79
									this.field3611.put(this.field3610[var1][var3].field3702, var1); // L: 80
								}
							}
						}
					}
				}

				Skills.field3912[var1] = true; // L: 86
				return true; // L: 87
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-6"
	)
	public void method6346(int var1) {
		if (var1 != -1) { // L: 91
			if (Skills.field3912[var1]) { // L: 92
				this.field3616.clearFilesGroup(var1); // L: 93
				if (this.field3610[var1] != null) { // L: 94
					for (int var2 = 0; var2 < this.field3610[var1].length; ++var2) { // L: 95
						if (this.field3610[var1][var2] != null) { // L: 96
							this.field3610[var1][var2] = null; // L: 97
						}
					}

					this.field3610[var1] = null; // L: 100
					Skills.field3912[var1] = false; // L: 101
				}
			}
		}
	} // L: 102

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "323588621"
	)
	public void method6349() {
		this.field3612.clear(); // L: 105
		this.field3606.clear(); // L: 106
		this.field3614.clear(); // L: 107
		this.field3609.clear(); // L: 108
	} // L: 109
}
