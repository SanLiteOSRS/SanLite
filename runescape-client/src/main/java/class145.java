import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
public class class145 extends class155 {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("Widget_modelsArchive")
	public static AbstractArchive Widget_modelsArchive;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 462461389
	)
	int field1684;
	@ObfuscatedName("w")
	byte field1687;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1636205357
	)
	int field1683;
	@ObfuscatedName("s")
	String field1686;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class156 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class145(class156 var1) {
		this.this$0 = var1;
		this.field1684 = -1; // L: 101
	} // L: 106

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lrd;B)V",
		garbageValue = "-123"
	)
	void vmethod3387(Buffer var1) {
		this.field1684 = var1.readUnsignedShort(); // L: 109
		this.field1687 = var1.readByte(); // L: 110
		this.field1683 = var1.readUnsignedShort(); // L: 111
		var1.readLong(); // L: 112
		this.field1686 = var1.readStringCp1252NullTerminated(); // L: 113
	} // L: 114

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lfm;I)V",
		garbageValue = "127147356"
	)
	void vmethod3388(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1684); // L: 117
		var2.rank = this.field1687; // L: 118
		var2.world = this.field1683; // L: 119
		var2.username = new Username(this.field1686); // L: 120
	} // L: 121

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqu;ILjava/lang/String;S)Ljava/lang/String;",
		garbageValue = "-3344"
	)
	static String method3192(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) { // L: 34
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1); // L: 35
			return var3 == null ? var2 : (String)var3.obj; // L: 36 37
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lba;",
		garbageValue = "-1454987791"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = (var1 << 8) + var0; // L: 40
		Script var6 = (Script)Script.Script_cached.get((long)(var3 << 16)); // L: 45
		Script var5;
		if (var6 != null) { // L: 46
			var5 = var6; // L: 47
		} else {
			String var7 = String.valueOf(var3); // L: 50
			int var8 = class12.archive12.getGroupId(var7); // L: 51
			if (var8 == -1) { // L: 52
				var5 = null; // L: 53
			} else {
				label58: {
					byte[] var9 = class12.archive12.takeFileFlat(var8); // L: 56
					if (var9 != null) { // L: 57
						if (var9.length <= 1) { // L: 58
							var5 = null; // L: 59
							break label58; // L: 60
						}

						var6 = WorldMapLabelSize.newScript(var9); // L: 62
						if (var6 != null) { // L: 63
							Script.Script_cached.put(var6, (long)(var3 << 16)); // L: 64
							var5 = var6; // L: 65
							break label58; // L: 66
						}
					}

					var5 = null; // L: 69
				}
			}
		}

		if (var5 != null) { // L: 72
			return var5; // L: 73
		} else {
			int var4 = class208.method4221(var2, var0); // L: 75
			Script var12 = (Script)Script.Script_cached.get((long)(var4 << 16)); // L: 78
			Script var13;
			if (var12 != null) { // L: 79
				var13 = var12; // L: 80
			} else {
				String var14 = String.valueOf(var4); // L: 83
				int var10 = class12.archive12.getGroupId(var14); // L: 84
				if (var10 == -1) { // L: 85
					var13 = null; // L: 86
				} else {
					byte[] var11 = class12.archive12.takeFileFlat(var10); // L: 89
					if (var11 != null) { // L: 90
						if (var11.length <= 1) { // L: 91
							var13 = null; // L: 92
							return var13 != null ? var13 : null; // L: 105 108
						}

						var12 = WorldMapLabelSize.newScript(var11); // L: 95
						if (var12 != null) { // L: 96
							Script.Script_cached.put(var12, (long)(var4 << 16)); // L: 97
							var13 = var12; // L: 98
							return var13 != null ? var13 : null;
						}
					}

					var13 = null; // L: 102
				}
			}

			return var13 != null ? var13 : null;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkz;IB)V",
		garbageValue = "33"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3632 == null) { // L: 1204
			throw new RuntimeException(); // L: 1205
		} else {
			if (var0.field3594 == null) { // L: 1207
				var0.field3594 = new int[var0.field3632.length]; // L: 1208
			}

			var0.field3594[var1] = Integer.MAX_VALUE; // L: 1210
		}
	} // L: 1211
}
