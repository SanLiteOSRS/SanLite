import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("p")
	public static boolean field1425;
	@ObfuscatedName("a")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;I)I",
		garbageValue = "1202670985"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Llg;Llg;Ljava/lang/String;Ljava/lang/String;B)Lnl;",
		garbageValue = "68"
	)
	public static Font method2790(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		int var4 = var0.getGroupId(var2); // L: 202
		int var5 = var0.getFileId(var4, var3); // L: 203
		return ByteArrayPool.method7165(var0, var1, var4, var5); // L: 204
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1646265072"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 1045
			var1 /= 2;
		}

		if (var2 > 192) { // L: 1046
			var1 /= 2;
		}

		if (var2 > 217) { // L: 1047
			var1 /= 2;
		}

		if (var2 > 243) { // L: 1048
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 1049
		return var3; // L: 1050
	}
}
