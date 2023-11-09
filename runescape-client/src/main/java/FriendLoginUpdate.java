import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("vu")
	@ObfuscatedGetter(
		intValue = -693221637
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 645904559
	)
	public int field4477;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lrg;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("c")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lrg;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4477 = (int)(UserComparator8.method2748() / 1000L); // L: 109
		this.username = var1; // L: 110
		this.world = (short)var2; // L: 111
	} // L: 112

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpe;ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1666410399"
	)
	static String method7304(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) { // L: 41
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1); // L: 42
			return var3 == null ? var2 : (String)var3.obj; // L: 43 44
		}
	}
}
