import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
public class class340 {
	@ObfuscatedName("ab")
	static boolean[] field3646;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	AbstractArchive field3641;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	AbstractArchive field3650;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	AbstractArchive field3653;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	AbstractArchive field3643;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	AbstractArchive field3649;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[[Lnt;"
	)
	public Widget[][] field3645;
	@ObfuscatedName("aw")
	Map field3647;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	EvictingDualNodeHashTable field3648;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	EvictingDualNodeHashTable field3644;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	EvictingDualNodeHashTable field3640;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	EvictingDualNodeHashTable field3651;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	class443 field3652;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	class443 field3642;

	@ObfuscatedSignature(
		descriptor = "(Loc;Loc;Loc;Loc;Loc;)V"
	)
	public class340(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4, AbstractArchive var5) {
		this.field3647 = new HashMap(); // L: 20
		this.field3648 = new EvictingDualNodeHashTable(200); // L: 21
		this.field3644 = new EvictingDualNodeHashTable(50); // L: 22
		this.field3640 = new EvictingDualNodeHashTable(20); // L: 23
		this.field3651 = new EvictingDualNodeHashTable(8); // L: 24
		this.field3652 = new class443(10, class441.field4748); // L: 25
		this.field3642 = new class443(10, class441.field4748); // L: 26
		int var6 = 0; // L: 29
		if (var1 != null) { // L: 30
			this.field3641 = var1; // L: 31
			this.field3653 = var2; // L: 32
			this.field3643 = var3; // L: 33
			this.field3649 = var4; // L: 34
			this.field3650 = var5; // L: 35
			var6 = this.field3641.getGroupCount(); // L: 36
		}

		this.field3645 = new Widget[var6][]; // L: 38
		field3646 = new boolean[var6]; // L: 39
	} // L: 40

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lnt;",
		garbageValue = "355172489"
	)
	public Widget method6281(int var1) {
		int var2 = var1 >> 16; // L: 43
		int var3 = var1 & 65535;
		if (this.field3645[var2] == null || this.field3645[var2][var3] == null) {
			boolean var4 = this.method6285(var2); // L: 46
			if (!var4) { // L: 47
				return null;
			}
		}

		return this.field3645[var2][var3]; // L: 49
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Lnt;",
		garbageValue = "1377973695"
	)
	public Widget method6286(int var1, int var2) {
		Widget var3 = this.method6281(var1); // L: 53
		if (var2 == -1) { // L: 54
			return var3;
		} else {
			return var3 != null && var3.children != null && var2 < var3.children.length ? var3.children[var2] : null; // L: 55 56
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "31"
	)
	public boolean method6285(int var1) {
		if (field3646[var1]) { // L: 60
			return true;
		} else if (!this.field3641.tryLoadGroup(var1)) { // L: 61
			return false;
		} else {
			int var2 = this.field3641.getGroupFileCount(var1); // L: 62
			if (var2 == 0) { // L: 63
				field3646[var1] = true; // L: 64
				return true; // L: 65
			} else {
				if (this.field3645[var1] == null) { // L: 67
					this.field3645[var1] = new Widget[var2];
				}

				for (int var3 = 0; var3 < var2; ++var3) { // L: 68
					if (this.field3645[var1][var3] == null) { // L: 69
						byte[] var4 = this.field3641.takeFile(var1, var3); // L: 70
						if (var4 != null) { // L: 71
							this.field3645[var1][var3] = new Widget(); // L: 72
							this.field3645[var1][var3].id = var3 + (var1 << 16); // L: 73
							if (var4[0] == -1) { // L: 74
								this.field3645[var1][var3].decode(new Buffer(var4));
							} else {
								this.field3645[var1][var3].decodeLegacy(new Buffer(var4)); // L: 75
							}

							if (this.field3650 != null) { // L: 76
								byte[] var5 = this.field3650.takeFile(var1, var3); // L: 77
								if (var5 != null && var5.length > 0) { // L: 78
									this.field3645[var1][var3].method6648(new Buffer(var5)); // L: 79
									this.field3647.put(this.field3645[var1][var3].field3744, var1); // L: 80
								}
							}
						}
					}
				}

				field3646[var1] = true; // L: 86
				return true; // L: 87
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "11"
	)
	public void method6283(int var1) {
		if (var1 != -1) { // L: 91
			if (field3646[var1]) { // L: 92
				this.field3641.clearFilesGroup(var1); // L: 93
				if (this.field3645[var1] != null) { // L: 94
					for (int var2 = 0; var2 < this.field3645[var1].length; ++var2) { // L: 95
						if (this.field3645[var1][var2] != null) { // L: 96
							this.field3645[var1][var2] = null; // L: 97
						}
					}

					this.field3645[var1] = null; // L: 100
					field3646[var1] = false; // L: 101
				}
			}
		}
	} // L: 102

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "802087593"
	)
	public void method6284() {
		this.field3648.clear(); // L: 105
		this.field3644.clear(); // L: 106
		this.field3640.clear(); // L: 107
		this.field3651.clear(); // L: 108
	} // L: 109

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lhw;",
		garbageValue = "1774162396"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 44 45
	}
}
