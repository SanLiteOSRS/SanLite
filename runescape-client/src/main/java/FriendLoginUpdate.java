import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rk")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("js")
	static int[][] field4752;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1925686629
	)
	public int field4751;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lvn;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("al")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lvn;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4751 = (int)(SecureRandomCallable.method2320() / 1000L); // L: 109
		this.username = var1; // L: 110
		this.world = (short)var2; // L: 111
	} // L: 112

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2060638001"
	)
	public static void method8302() {
		KitDefinition.field1905 = null; // L: 143
		class4.KitDefinition_modelsArchive = null; // L: 144
		KitDefinition.field1894 = 0; // L: 145
	} // L: 146
}
