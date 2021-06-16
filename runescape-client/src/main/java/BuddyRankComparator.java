import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "[Loa;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lly;Lly;I)I",
		garbageValue = "1922516179"
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

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-16777217"
	)
	static final void method2579() {
		if (class26.ClanChat_inClanChat) {
			if (class289.friendsChatManager != null) {
				class289.friendsChatManager.sort();
			}

			WorldMapCacheName.method3788();
			class26.ClanChat_inClanChat = false;
		}

	}
}
