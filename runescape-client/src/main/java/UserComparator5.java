import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("u")
	public static short[] field1442;
	@ObfuscatedName("z")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 1854633345
	)
	@Export("selectedItemId")
	static int selectedItemId;
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llv;Llv;I)I",
		garbageValue = "1211998991"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) {
			if (var2.world == 0) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljv;Ljv;I)Z",
		garbageValue = "-1243272557"
	)
	public static boolean method2449(AbstractArchive var0, AbstractArchive var1) {
		WorldMapElement.WorldMapElement_archive = var1;
		if (!var0.isFullyLoaded()) {
			return false;
		} else {
			class311.WorldMapElement_count = var0.getGroupFileCount(35);
			WorldMapElement.WorldMapElement_cached = new WorldMapElement[class311.WorldMapElement_count];

			for (int var2 = 0; var2 < class311.WorldMapElement_count; ++var2) {
				byte[] var3 = var0.takeFile(35, var2);
				WorldMapElement.WorldMapElement_cached[var2] = new WorldMapElement(var2);
				if (var3 != null) {
					WorldMapElement.WorldMapElement_cached[var2].decode(new Buffer(var3));
					WorldMapElement.WorldMapElement_cached[var2].method2634();
				}
			}

			return true;
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(Lch;I)V",
		garbageValue = "14093457"
	)
	static final void method2448(PendingSpawn var0) {
		long var1 = 0L;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var0.type == 0) {
			var1 = AbstractSocket.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) {
			var1 = AbstractSocket.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) {
			var1 = AbstractSocket.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = AbstractSocket.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (0L != var1) {
			int var6 = AbstractSocket.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
			var3 = class93.Entity_unpackID(var1);
			var4 = var6 & 31;
			var5 = var6 >> 6 & 3;
		}

		var0.objectId = var3;
		var0.field1229 = var4;
		var0.field1225 = var5;
	}
}
