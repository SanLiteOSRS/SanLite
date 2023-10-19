import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
public class class338 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	AbstractArchive field3583;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	AbstractArchive field3579;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	AbstractArchive field3580;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	AbstractArchive field3581;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	AbstractArchive field3582;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[[Lnm;"
	)
	public Widget[][] field3587;
	@ObfuscatedName("ab")
	Map field3588;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	EvictingDualNodeHashTable field3585;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	EvictingDualNodeHashTable field3589;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	EvictingDualNodeHashTable field3586;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	EvictingDualNodeHashTable field3584;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	class438 field3578;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	class438 field3590;

	@ObfuscatedSignature(
		descriptor = "(Lom;Lom;Lom;Lom;Lom;)V"
	)
	public class338(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4, AbstractArchive var5) {
		this.field3588 = new HashMap(); // L: 20
		this.field3585 = new EvictingDualNodeHashTable(200); // L: 21
		this.field3589 = new EvictingDualNodeHashTable(50); // L: 22
		this.field3586 = new EvictingDualNodeHashTable(20); // L: 23
		this.field3584 = new EvictingDualNodeHashTable(8); // L: 24
		this.field3578 = new class438(10, class436.field4651); // L: 25
		this.field3590 = new class438(10, class436.field4651); // L: 26
		int var6 = 0; // L: 29
		if (var1 != null) { // L: 30
			this.field3583 = var1; // L: 31
			this.field3580 = var2; // L: 32
			this.field3581 = var3; // L: 33
			this.field3582 = var4; // L: 34
			this.field3579 = var5; // L: 35
			var6 = this.field3583.getGroupCount(); // L: 36
		}

		this.field3587 = new Widget[var6][]; // L: 38
		AbstractUserComparator.field4699 = new boolean[var6]; // L: 39
	} // L: 40

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lnm;",
		garbageValue = "-836235004"
	)
	public Widget method6240(int var1) {
		int var2 = var1 >> 16; // L: 43
		int var3 = var1 & 65535; // L: 44
		if (this.field3587[var2] == null || this.field3587[var2][var3] == null) { // L: 45
			boolean var4 = this.method6242(var2); // L: 46
			if (!var4) { // L: 47
				return null;
			}
		}

		return this.field3587[var2][var3]; // L: 49
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)Lnm;",
		garbageValue = "-356739593"
	)
	public Widget method6241(int var1, int var2) {
		Widget var3 = this.method6240(var1); // L: 53
		if (var2 == -1) { // L: 54
			return var3;
		} else {
			return var3 != null && var3.children != null && var2 < var3.children.length ? var3.children[var2] : null; // L: 55 56
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "-8971"
	)
	public boolean method6242(int var1) {
		if (AbstractUserComparator.field4699[var1]) { // L: 60
			return true;
		} else if (!this.field3583.tryLoadGroup(var1)) { // L: 61
			return false;
		} else {
			int var2 = this.field3583.getGroupFileCount(var1); // L: 62
			if (var2 == 0) { // L: 63
				AbstractUserComparator.field4699[var1] = true; // L: 64
				return true; // L: 65
			} else {
				if (this.field3587[var1] == null) { // L: 67
					this.field3587[var1] = new Widget[var2];
				}

				for (int var3 = 0; var3 < var2; ++var3) { // L: 68
					if (this.field3587[var1][var3] == null) { // L: 69
						byte[] var4 = this.field3583.takeFile(var1, var3); // L: 70
						if (var4 != null) { // L: 71
							this.field3587[var1][var3] = new Widget(); // L: 72
							this.field3587[var1][var3].id = var3 + (var1 << 16); // L: 73
							if (var4[0] == -1) { // L: 74
								this.field3587[var1][var3].decode(new Buffer(var4));
							} else {
								this.field3587[var1][var3].decodeLegacy(new Buffer(var4)); // L: 75
							}

							if (this.field3579 != null) { // L: 76
								byte[] var5 = this.field3579.takeFile(var1, var3); // L: 77
								if (var5 != null && var5.length > 0) { // L: 78
									this.field3587[var1][var3].method6651(new Buffer(var5)); // L: 79
									this.field3588.put(this.field3587[var1][var3].field3677, var1); // L: 80
								}
							}
						}
					}
				}

				AbstractUserComparator.field4699[var1] = true; // L: 86
				return true; // L: 87
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1200843852"
	)
	public void method6243(int var1) {
		if (var1 != -1) { // L: 91
			if (AbstractUserComparator.field4699[var1]) { // L: 92
				this.field3583.clearFilesGroup(var1); // L: 93
				if (this.field3587[var1] != null) { // L: 94
					for (int var2 = 0; var2 < this.field3587[var1].length; ++var2) { // L: 95
						if (this.field3587[var1][var2] != null) { // L: 96
							this.field3587[var1][var2] = null; // L: 97
						}
					}

					this.field3587[var1] = null; // L: 100
					AbstractUserComparator.field4699[var1] = false; // L: 101
				}
			}
		}
	} // L: 102

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-17"
	)
	public void method6252() {
		this.field3585.clear(); // L: 105
		this.field3589.clear(); // L: 106
		this.field3586.clear(); // L: 107
		this.field3584.clear(); // L: 108
	} // L: 109

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(III)Ljava/lang/String;",
		garbageValue = "-1362915838"
	)
	static final String method6257(int var0, int var1) {
		int var2 = var1 - var0; // L: 10613
		if (var2 < -9) { // L: 10614
			return Client.colorStartTag(16711680);
		} else if (var2 < -6) { // L: 10615
			return Client.colorStartTag(16723968);
		} else if (var2 < -3) { // L: 10616
			return Client.colorStartTag(16740352);
		} else if (var2 < 0) { // L: 10617
			return Client.colorStartTag(16756736);
		} else if (var2 > 9) {
			return Client.colorStartTag(65280); // L: 10618
		} else if (var2 > 6) { // L: 10619
			return Client.colorStartTag(4259584);
		} else if (var2 > 3) { // L: 10620
			return Client.colorStartTag(8453888);
		} else {
			return var2 > 0 ? Client.colorStartTag(12648192) : Client.colorStartTag(16776960); // L: 10621 10622
		}
	}
}
