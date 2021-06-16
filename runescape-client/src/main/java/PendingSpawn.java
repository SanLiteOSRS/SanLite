import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lck;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = 957608349
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 857968295
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -460142403
	)
	@Export("type")
	int type;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1653690201
	)
	@Export("x")
	int x;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 821820447
	)
	@Export("y")
	int y;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -299162955
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1733340657
	)
	int field1209;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -857810119
	)
	int field1210;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1775664849
	)
	@Export("id")
	int id;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1304592611
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1665765945
	)
	int field1213;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -259916535
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -2001874623
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.delay = 0;
		this.hitpoints = -1;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILla;Ljf;I)V",
		garbageValue = "1024177105"
	)
	static void method2261(int var0, ArchiveDisk var1, Archive var2) {
		byte[] var3 = null;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			for (ArchiveDiskAction var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var5 != null; var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
				if ((long)var0 == var5.key && var1 == var5.archiveDisk && var5.type == 0) {
					var3 = var5.data;
					break;
				}
			}
		}

		if (var3 != null) {
			var2.load(var1, var0, var3, true);
		} else {
			byte[] var4 = var1.read(var0);
			var2.load(var1, var0, var4, true);
		}
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "450155015"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}
}
