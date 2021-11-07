import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("rd")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("sn")
	@ObfuscatedGetter(
		intValue = -319897600
	)
	static int field1333;
	@ObfuscatedName("p")
	@Export("ItemDefinition_inMembersWorld")
	public static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("i")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lmt;Lmt;B)I",
		garbageValue = "1"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) {
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lko;III)Z",
		garbageValue = "2134321189"
	)
	@Export("SpriteBuffer_loadSpritesFromArchive")
	public static boolean SpriteBuffer_loadSpritesFromArchive(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2);
		if (var3 == null) {
			return false;
		} else {
			Script.SpriteBuffer_decode(var3);
			return true;
		}
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "459"
	)
	static void method2500() {
		int var0 = Players.Players_count;
		int[] var1 = Players.Players_indices;

		for (int var2 = 0; var2 < var0; ++var2) {
			if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) {
				class132.addPlayerToScene(Client.players[var1[var2]], true);
			}
		}

	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I)Ljf;",
		garbageValue = "1540120138"
	)
	static Widget method2501(Widget var0) {
		int var2 = PendingSpawn.getWidgetFlags(var0);
		int var1 = var2 >> 17 & 7;
		int var3 = var1;
		if (var1 == 0) {
			return null;
		} else {
			for (int var4 = 0; var4 < var3; ++var4) {
				var0 = UserComparator9.getWidget(var0.parentId);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}
}
