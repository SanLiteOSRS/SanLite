import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = -765310817
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;
	@ObfuscatedName("h")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Llq;Llq;I)I",
		garbageValue = "1501213760"
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II)I",
		garbageValue = "686379758"
	)
	public static int method2440(CharSequence var0, int var1) {
		return class18.method255(var0, var1, true);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1683819364"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (class5.Widget_loadedInterfaces[var0]) {
			return true;
		} else if (!GrandExchangeOffer.Widget_archive.tryLoadGroup(var0)) {
			return false;
		} else {
			int var1 = GrandExchangeOffer.Widget_archive.getGroupFileCount(var0);
			if (var1 == 0) {
				class5.Widget_loadedInterfaces[var0] = true;
				return true;
			} else {
				if (Widget.Widget_interfaceComponents[var0] == null) {
					Widget.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) {
					if (Widget.Widget_interfaceComponents[var0][var2] == null) {
						byte[] var3 = GrandExchangeOffer.Widget_archive.takeFile(var0, var2);
						if (var3 != null) {
							Widget.Widget_interfaceComponents[var0][var2] = new Widget();
							Widget.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16);
							if (var3[0] == -1) {
								Widget.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								Widget.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
							}
						}
					}
				}

				class5.Widget_loadedInterfaces[var0] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1727381075"
	)
	public static void method2447() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
	}
}
