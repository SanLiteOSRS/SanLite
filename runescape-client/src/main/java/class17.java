import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public class class17 extends class14 {
	@ObfuscatedName("f")
	boolean field140;
	@ObfuscatedName("e")
	byte field136;
	@ObfuscatedName("v")
	byte field137;
	@ObfuscatedName("y")
	byte field135;
	@ObfuscatedName("j")
	byte field139;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lv;)V"
	)
	class17(class2 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "73833784"
	)
	void vmethod363(Buffer var1) {
		this.field140 = var1.readUnsignedByte() == 1;
		this.field136 = var1.readByte();
		this.field137 = var1.readByte();
		this.field135 = var1.readByte();
		this.field139 = var1.readByte();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;I)V",
		garbageValue = "1885623446"
	)
	void vmethod354(ClanSettings var1) {
		var1.allowGuests = this.field140;
		var1.field87 = this.field136;
		var1.field88 = this.field137;
		var1.field93 = this.field135;
		var1.field90 = this.field139;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-50"
	)
	static String method255() {
		return class4.clientPreferences.hideUsername ? class22.method315(Login.Login_username) : Login.Login_username;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)Liv;",
		garbageValue = "-571050051"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = WorldMapData_1.getWidget(var0);
		if (var1 == -1) {
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-148102361"
	)
	static int method258(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field959 - 7.0D) * 256.0D);
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "614337343"
	)
	static final void method261() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0.hitpoints > 0) {
				--var0.hitpoints;
			}

			boolean var1;
			int var2;
			int var3;
			ObjectComposition var4;
			if (var0.hitpoints == 0) {
				if (var0.objectId >= 0) {
					var2 = var0.objectId;
					var3 = var0.field1210;
					var4 = Tiles.getObjectDefinition(var2);
					if (var3 == 11) {
						var3 = 10;
					}

					if (var3 >= 5 && var3 <= 8) {
						var3 = 4;
					}

					var1 = var4.method3019(var3);
					if (!var1) {
						continue;
					}
				}

				WorldMapEvent.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field1209, var0.field1210);
				var0.remove();
			} else {
				if (var0.delay > 0) {
					--var0.delay;
				}

				if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102) {
					if (var0.id >= 0) {
						var2 = var0.id;
						var3 = var0.field1213;
						var4 = Tiles.getObjectDefinition(var2);
						if (var3 == 11) {
							var3 = 10;
						}

						if (var3 >= 5 && var3 <= 8) {
							var3 = 4;
						}

						var1 = var4.method3019(var3);
						if (!var1) {
							continue;
						}
					}

					WorldMapEvent.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.id, var0.orientation, var0.field1213);
					var0.delay = -1;
					if (var0.id == var0.objectId && var0.objectId == -1) {
						var0.remove();
					} else if (var0.id == var0.objectId && var0.field1209 == var0.orientation && var0.field1210 == var0.field1213) {
						var0.remove();
					}
				}
			}
		}

	}
}
