import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rn")
public class class468 extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static AbstractArchive field4918;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("DBRowType_cache")
	public static EvictingDualNodeHashTable DBRowType_cache;
	@ObfuscatedName("v")
	Object[][] field4916;
	@ObfuscatedName("s")
	int[][] field4919;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1930079777
	)
	public int field4920;

	static {
		DBRowType_cache = new EvictingDualNodeHashTable(64); // L: 11
	}

	class468() {
		this.field4920 = -1; // L: 14
	} // L: 17

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "138870085"
	)
	void method8556(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 36
			if (var2 == 0) { // L: 37
				return; // L: 40
			}

			this.method8557(var1, var2); // L: 38
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)[Ljava/lang/Object;",
		garbageValue = "18"
	)
	public Object[] method8569(int var1) {
		return this.field4916 == null ? null : this.field4916[var1]; // L: 43 44
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lrd;II)V",
		garbageValue = "1069329376"
	)
	void method8557(Buffer var1, int var2) {
		if (var2 == 3) { // L: 48
			int var3 = var1.readUnsignedByte(); // L: 49
			if (this.field4916 == null) { // L: 50
				this.field4916 = new Object[var3][]; // L: 51
				this.field4919 = new int[var3][]; // L: 52
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) { // L: 54 55 78
				int var5 = var1.readUnsignedByte(); // L: 56
				int[] var6 = new int[var5]; // L: 57

				for (int var7 = 0; var7 < var5; ++var7) { // L: 58
					var6[var7] = var1.readUShortSmart(); // L: 59
				}

				Object[][] var16 = this.field4916; // L: 61
				int var10 = var1.readUShortSmart(); // L: 65
				Object[] var11 = new Object[var6.length * var10]; // L: 66

				for (int var12 = 0; var12 < var10; ++var12) { // L: 67
					for (int var13 = 0; var13 < var6.length; ++var13) { // L: 68
						int var14 = var13 + var6.length * var12; // L: 69
						class463 var15 = class370.method7047(var6[var13]); // L: 70
						var11[var14] = var15.method8507(var1); // L: 71
					}
				}

				var16[var4] = var11; // L: 76
				this.field4919[var4] = var6; // L: 77
			}
		} else if (var2 == 4) { // L: 81
			this.field4920 = var1.method8665(); // L: 82
		}

	} // L: 85

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1520825771"
	)
	void method8558() {
	} // L: 87

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(Lkz;I)V",
		garbageValue = "-1866344930"
	)
	static final void method8572(Widget var0) {
		int var1 = var0.contentType; // L: 12846
		if (var1 == 324) { // L: 12847
			if (Client.field787 == -1) { // L: 12848
				Client.field787 = var0.spriteId2; // L: 12849
				Client.field788 = var0.spriteId; // L: 12850
			}

			if (Client.playerAppearance.field3491 == 1) { // L: 12852
				var0.spriteId2 = Client.field787;
			} else {
				var0.spriteId2 = Client.field788; // L: 12853
			}

		} else if (var1 == 325) { // L: 12856
			if (Client.field787 == -1) { // L: 12857
				Client.field787 = var0.spriteId2; // L: 12858
				Client.field788 = var0.spriteId; // L: 12859
			}

			if (Client.playerAppearance.field3491 == 1) { // L: 12861
				var0.spriteId2 = Client.field788;
			} else {
				var0.spriteId2 = Client.field787; // L: 12862
			}

		} else if (var1 == 327) { // L: 12865
			var0.modelAngleX = 150; // L: 12866
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12867
			var0.modelType = 5; // L: 12868
			var0.modelId = 0; // L: 12869
		} else if (var1 == 328) { // L: 12872
			var0.modelAngleX = 150; // L: 12873
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12874
			var0.modelType = 5; // L: 12875
			var0.modelId = 1; // L: 12876
		}
	} // L: 12854 12863 12870 12877 12879
}
