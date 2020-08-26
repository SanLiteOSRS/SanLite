import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lcy;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 394588123
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("s")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("t")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-1817871528"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (WorldMapScaleHandler.World_request == null) {
				WorldMapScaleHandler.World_request = UserComparator4.urlRequester.request(new URL(BZip2State.field3771));
			} else if (WorldMapScaleHandler.World_request.isDone()) {
				byte[] var0 = WorldMapScaleHandler.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				AbstractByteArrayCopier.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = AbstractByteArrayCopier.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				FloorDecoration.sortWorlds(AbstractByteArrayCopier.World_worlds, 0, AbstractByteArrayCopier.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				WorldMapScaleHandler.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			WorldMapScaleHandler.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "75"
	)
	static void method1192() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (Tile.clientPreferences.rememberedUsername != null) {
				Login.Login_username = Tile.clientPreferences.rememberedUsername;
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}

		}
	}
}
