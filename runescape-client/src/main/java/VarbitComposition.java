import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("j")
	static final int[] field1702;
	@ObfuscatedName("l")
	public static short[][] field1708;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2059144841
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1506226221
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -354172645
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		field1702 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field1702[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-683331130"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnd;II)V",
		garbageValue = "375304564"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1858038859"
	)
	static void method2859() {
		if (SoundSystem.loadWorlds()) {
			Login.worldSelectOpen = true;
			Login.worldSelectPage = 0;
			Login.worldSelectPagesCount = 0;
		}

	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-21"
	)
	static final void method2849(boolean var0) {
		if (var0) {
			Client.field676 = Login.field1043 ? class125.field1469 : class125.field1471;
		} else {
			LinkedHashMap var1 = ObjectComposition.clientPreferences.parameters;
			String var3 = Login.Login_username;
			int var4 = var3.length();
			int var5 = 0;

			for (int var6 = 0; var6 < var4; ++var6) {
				var5 = (var5 << 5) - var5 + var3.charAt(var6);
			}

			Client.field676 = var1.containsKey(var5) ? class125.field1470 : class125.field1468;
		}

	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1518032135"
	)
	static final void method2846() {
		if (class21.field190) {
			for (int var0 = 0; var0 < Players.Players_count; ++var0) {
				Player var1 = Client.players[Players.Players_indices[var0]];
				var1.method2147();
			}

			class21.field190 = false;
		}

	}
}
