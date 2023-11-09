import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("LIVE")
	public static final GameBuild LIVE;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("BUILDLIVE")
	public static final GameBuild BUILDLIVE;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("RC")
	public static final GameBuild RC;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("WIP")
	public static final GameBuild WIP;
	@ObfuscatedName("aq")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("as")
	@Export("name")
	public final String name;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1386645051
	)
	@Export("buildId")
	public final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0); // L: 5
		BUILDLIVE = new GameBuild("BUILDLIVE", 3); // L: 6
		RC = new GameBuild("RC", 1); // L: 7
		WIP = new GameBuild("WIP", 2); // L: 8
	}

	GameBuild(String var1, int var2) {
		this.name = var1; // L: 13
		this.buildId = var2; // L: 14
	} // L: 15

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;B)I",
		garbageValue = "-18"
	)
	static int method6651(AbstractArchive var0) {
		int var1 = Login.field954.length + Login.field919.length; // L: 168
		String[] var2 = Login.field934; // L: 170

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 171
			String var4 = var2[var3]; // L: 172
			if (var0.getGroupId(var4) != -1) { // L: 174
				++var1; // L: 175
			}
		}

		return var1; // L: 180
	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 12625

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 12626
			var1.clearIsFromIgnored(); // L: 12628
		}

		if (Canvas.friendsChatManager != null) { // L: 12632
			Canvas.friendsChatManager.invalidateIgnoreds(); // L: 12633
		}

	} // L: 12635
}
