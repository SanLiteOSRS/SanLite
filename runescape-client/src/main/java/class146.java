import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public class class146 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 2173419995924177459L
	)
	long field1661;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2093798089
	)
	int field1660;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	IterableNodeDeque field1657;

	@ObfuscatedSignature(
		descriptor = "(Lty;)V"
	)
	public class146(Buffer var1) {
		this.field1660 = -1; // L: 9
		this.field1657 = new IterableNodeDeque(); // L: 10
		this.method3155(var1); // L: 28
	} // L: 29

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "-625880362"
	)
	void method3155(Buffer var1) {
		this.field1661 = var1.readLong(); // L: 32
		this.field1660 = var1.readInt(); // L: 33

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34 35 55
			Object var3;
			if (var2 == 3) { // L: 37
				var3 = new class165(this);
			} else if (var2 == 1) { // L: 38
				var3 = new class141(this);
			} else if (var2 == 13) { // L: 39
				var3 = new class158(this);
			} else if (var2 == 4) { // L: 40
				var3 = new class150(this);
			} else if (var2 == 6) {
				var3 = new class157(this); // L: 41
			} else if (var2 == 5) { // L: 42
				var3 = new class142(this);
			} else if (var2 == 2) { // L: 43
				var3 = new class147(this);
			} else if (var2 == 7) { // L: 44
				var3 = new class140(this);
			} else if (var2 == 14) { // L: 45
				var3 = new class144(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class161(this);
			} else if (var2 == 9) { // L: 47
				var3 = new class167(this);
			} else if (var2 == 10) {
				var3 = new class153(this); // L: 48
			} else if (var2 == 11) { // L: 49
				var3 = new class148(this);
			} else if (var2 == 12) { // L: 50
				var3 = new class152(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException(""); // L: 52
				}

				var3 = new class162(this);
			}

			((class143)var3).vmethod3412(var1); // L: 53
			this.field1657.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfx;I)V",
		garbageValue = "-955904177"
	)
	public void method3159(ClanSettings var1) {
		if (this.field1661 == var1.field1704 && this.field1660 == var1.field1707) { // L: 60
			for (class143 var2 = (class143)this.field1657.last(); var2 != null; var2 = (class143)this.field1657.previous()) { // L: 61
				var2.vmethod3419(var1); // L: 62
			}

			++var1.field1707; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "0"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 12790
		short[] var2 = new short[16]; // L: 12791
		int var3 = 0; // L: 12792

		for (int var4 = 0; var4 < class239.ItemComposition_fileCount; ++var4) { // L: 12793
			ItemComposition var9 = class125.ItemComposition_get(var4); // L: 12794
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 12795 12796 12797
				if (var3 >= 250) { // L: 12798
					JagexCache.foundItemIdCount = -1; // L: 12799
					MouseRecorder.foundItemIds = null; // L: 12800
					return; // L: 12801
				}

				if (var3 >= var2.length) { // L: 12803
					short[] var6 = new short[var2.length * 2]; // L: 12804

					for (int var7 = 0; var7 < var3; ++var7) { // L: 12805
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 12806
				}

				var2[var3++] = (short)var4; // L: 12808
			}
		}

		MouseRecorder.foundItemIds = var2; // L: 12810
		ClanSettings.foundItemIndex = 0; // L: 12811
		JagexCache.foundItemIdCount = var3; // L: 12812
		String[] var8 = new String[JagexCache.foundItemIdCount]; // L: 12813

		for (int var5 = 0; var5 < JagexCache.foundItemIdCount; ++var5) { // L: 12814
			var8[var5] = class125.ItemComposition_get(var2[var5]).name;
		}

		class481.method8509(var8, MouseRecorder.foundItemIds); // L: 12815
	} // L: 12816

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-618232336"
	)
	static void method3154() {
		for (int var0 = 0; var0 < Client.field654.size(); ++var0) { // L: 12939
			if (class273.method5525((Integer)Client.field654.get(var0)) != 2) { // L: 12940
				Client.field654.remove(var0); // L: 12941
				--var0; // L: 12942
			}
		}

	} // L: 12945
}
