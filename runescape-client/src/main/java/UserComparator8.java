import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lly;Lly;B)I",
		garbageValue = "1"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) {
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljs;",
		garbageValue = "2010413146"
	)
	static GameBuild[] method2538() {
		return new GameBuild[]{GameBuild.WIP, GameBuild.BUILDLIVE, GameBuild.RC, GameBuild.LIVE};
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Liv;I[B[BI)V",
		garbageValue = "700891995"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3035 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3035 = new byte[11][];
			var0.field3036 = new byte[11][];
			var0.field3037 = new int[11];
			var0.field3038 = new int[11];
		}

		var0.field3035[var1] = var2;
		if (var2 != null) {
			var0.field3034 = true;
		} else {
			var0.field3034 = false;

			for (int var4 = 0; var4 < var0.field3035.length; ++var4) {
				if (var0.field3035[var4] != null) {
					var0.field3034 = true;
					break;
				}
			}
		}

		var0.field3036[var1] = var3;
	}
}
