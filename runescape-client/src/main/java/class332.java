import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
public class class332 extends Node {
	@ObfuscatedName("wu")
	@ObfuscatedSignature(
		descriptor = "Lcr;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1377106927
	)
	int field3585;
	@ObfuscatedName("ap")
	BitSet field3586;

	class332(int var1) {
		this.field3585 = var1;
		this.field3586 = new BitSet(128);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lth;B)I",
		garbageValue = "7"
	)
	public static final int method6308(LoginType var0) {
		if (var0 == null) {
			return 12; // L: 17
		} else {
			switch(var0.field5071) { // L: 19
			case 1:
				return 20; // L: 21
			default:
				return 12; // L: 23
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "-2063514940"
	)
	public static byte[] method6309(CharSequence var0) {
		int var1 = var0.length(); // L: 9
		byte[] var2 = new byte[var1]; // L: 10

		for (int var3 = 0; var3 < var1; ++var3) { // L: 11
			char var4 = var0.charAt(var3); // L: 12
			if (var4 > 127) { // L: 13
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4; // L: 14
			}
		}

		return var2; // L: 16
	}

	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1938116743"
	)
	static String method6310(String var0) {
		PlayerType[] var1 = class184.PlayerType_values(); // L: 12720

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12721
			PlayerType var3 = var1[var2]; // L: 12722
			if (var3.modIcon != -1 && var0.startsWith(class228.method4503(var3.modIcon))) { // L: 12724 12725
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 12726
				break;
			}
		}

		return var0; // L: 12733
	}
}
