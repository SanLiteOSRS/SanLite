import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
public class class340 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	AbstractArchive field3631;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	AbstractArchive field3625;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	AbstractArchive field3626;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	AbstractArchive field3632;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	AbstractArchive field3628;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[[Lng;"
	)
	public Widget[][] field3633;
	@ObfuscatedName("az")
	Map field3630;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	EvictingDualNodeHashTable field3624;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	EvictingDualNodeHashTable field3627;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	EvictingDualNodeHashTable field3637;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	EvictingDualNodeHashTable field3634;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	class442 field3635;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	class442 field3636;

	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;Lof;Lof;Lof;)V"
	)
	public class340(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4, AbstractArchive var5) {
		this.field3630 = new HashMap(); // L: 20
		this.field3624 = new EvictingDualNodeHashTable(200); // L: 21
		this.field3627 = new EvictingDualNodeHashTable(50); // L: 22
		this.field3637 = new EvictingDualNodeHashTable(20); // L: 23
		this.field3634 = new EvictingDualNodeHashTable(8); // L: 24
		this.field3635 = new class442(10, class440.field4712); // L: 25
		this.field3636 = new class442(10, class440.field4712); // L: 26
		int var6 = 0; // L: 29
		if (var1 != null) { // L: 30
			this.field3631 = var1; // L: 31
			this.field3626 = var2; // L: 32
			this.field3632 = var3; // L: 33
			this.field3628 = var4; // L: 34
			this.field3625 = var5; // L: 35
			var6 = this.field3631.getGroupCount(); // L: 36
		}

		this.field3633 = new Widget[var6][]; // L: 38
		BuddyRankComparator.field1481 = new boolean[var6]; // L: 39
	} // L: 40

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lng;",
		garbageValue = "988314725"
	)
	public Widget method6431(int var1) {
		int var2 = var1 >> 16; // L: 43
		int var3 = var1 & 65535; // L: 44
		if (this.field3633[var2] == null || this.field3633[var2][var3] == null) { // L: 45
			boolean var4 = this.method6437(var2); // L: 46
			if (!var4) { // L: 47
				return null;
			}
		}

		return this.field3633[var2][var3]; // L: 49
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)Lng;",
		garbageValue = "820531032"
	)
	public Widget method6433(int var1, int var2) {
		Widget var3 = this.method6431(var1); // L: 53
		if (var2 == -1) { // L: 54
			return var3;
		} else {
			return var3 != null && var3.children != null && var2 < var3.children.length ? var3.children[var2] : null; // L: 55 56
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-656309693"
	)
	public boolean method6437(int var1) {
		if (BuddyRankComparator.field1481[var1]) { // L: 60
			return true;
		} else if (!this.field3631.tryLoadGroup(var1)) { // L: 61
			return false;
		} else {
			int var2 = this.field3631.getGroupFileCount(var1); // L: 62
			if (var2 == 0) { // L: 63
				BuddyRankComparator.field1481[var1] = true; // L: 64
				return true; // L: 65
			} else {
				if (this.field3633[var1] == null) { // L: 67
					this.field3633[var1] = new Widget[var2];
				}

				for (int var3 = 0; var3 < var2; ++var3) { // L: 68
					if (this.field3633[var1][var3] == null) { // L: 69
						byte[] var4 = this.field3631.takeFile(var1, var3); // L: 70
						if (var4 != null) { // L: 71
							this.field3633[var1][var3] = new Widget(); // L: 72
							this.field3633[var1][var3].id = var3 + (var1 << 16); // L: 73
							if (var4[0] == -1) { // L: 74
								this.field3633[var1][var3].decode(new Buffer(var4));
							} else {
								this.field3633[var1][var3].decodeLegacy(new Buffer(var4)); // L: 75
							}

							if (this.field3625 != null) { // L: 76
								byte[] var5 = this.field3625.takeFile(var1, var3); // L: 77
								if (var5 != null && var5.length > 0) { // L: 78
									this.field3633[var1][var3].method6791(new Buffer(var5)); // L: 79
									this.field3630.put(this.field3633[var1][var3].field3846, var1); // L: 80
								}
							}
						}
					}
				}

				BuddyRankComparator.field1481[var1] = true; // L: 86
				return true; // L: 87
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-830690101"
	)
	public void method6434(int var1) {
		if (var1 != -1) { // L: 91
			if (BuddyRankComparator.field1481[var1]) { // L: 92
				this.field3631.clearFilesGroup(var1); // L: 93
				if (this.field3633[var1] != null) { // L: 94
					for (int var2 = 0; var2 < this.field3633[var1].length; ++var2) { // L: 95
						if (this.field3633[var1][var2] != null) { // L: 96
							this.field3633[var1][var2] = null; // L: 97
						}
					}

					this.field3633[var1] = null; // L: 100
					BuddyRankComparator.field1481[var1] = false; // L: 101
				}
			}
		}
	} // L: 102

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1937556555"
	)
	public void method6436() {
		this.field3624.clear(); // L: 105
		this.field3627.clear(); // L: 106
		this.field3637.clear(); // L: 107
		this.field3634.clear(); // L: 108
	} // L: 109
}
