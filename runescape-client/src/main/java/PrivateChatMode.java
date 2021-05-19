import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	static final PrivateChatMode field3901;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	public static final PrivateChatMode field3899;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	static final PrivateChatMode field3900;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -803781563
	)
	public final int field3898;

	static {
		field3901 = new PrivateChatMode(0);
		field3899 = new PrivateChatMode(1);
		field3900 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field3898 = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1851240875"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (World.World_request == null) {
				World.World_request = class19.urlRequester.request(new URL(Canvas.field291));
			} else if (World.World_request.isDone()) {
				byte[] var0 = World.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				Messages.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = Messages.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				VarcInt.sortWorlds(Messages.World_worlds, 0, Messages.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				World.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			World.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-10"
	)
	public static void method5815() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
	}
}
