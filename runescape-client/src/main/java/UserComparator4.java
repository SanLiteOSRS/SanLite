import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	@Export("soundCache")
	public static SoundCache soundCache;
	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("ay")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lqc;Lqc;I)I",
		garbageValue = "-2129400962"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 14
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2); // L: 18
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILni;Ljava/lang/String;Ljava/lang/String;IZI)V",
		garbageValue = "-247015488"
	)
	public static void method2839(int var0, AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		if (var1.isValidFileName(var2, var3)) { // L: 69
			int var6 = var1.getGroupId(var2); // L: 70
			int var7 = var1.getFileId(var6, var3); // L: 71
			ClanChannel.method3327(var0, var1, var6, var7, var4, var5); // L: 72
		}

	} // L: 74
}
