import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("o")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("hw")
	@ObfuscatedGetter(
		intValue = -216533437
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("nu")
	@ObfuscatedGetter(
		intValue = -898435727
	)
	static int field296;
	@ObfuscatedName("f")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "44"
	)
	static void method495() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var0.obj != null) {
				var0.set();
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2014736548"
	)
	static int method498(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILiw;ZI)V",
		garbageValue = "865156803"
	)
	static void method497(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = BZip2State.getWorldMap().getMapArea(var0);
		int var4 = class262.localPlayer.plane;
		int var5 = class15.baseX * 64 + (class262.localPlayer.x >> 7);
		int var6 = WorldMapSprite.baseY * 64 + (class262.localPlayer.y >> 7);
		Coord var7 = new Coord(var4, var5, var6);
		BZip2State.getWorldMap().method6147(var3, var7, var1, var2);
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1340862776"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			class4.clientPreferences.roofsHidden = !class4.clientPreferences.roofsHidden;
			Actor.savePreferences();
			if (class4.clientPreferences.roofsHidden) {
				UserComparator10.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				UserComparator10.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			Client.displayFps = !Client.displayFps;
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				class80.worldMap.showCoord = !class80.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				Client.displayFps = true;
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				Client.displayFps = false;
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				ApproximateRouteStrategy.method1268();
			}
		}

		PacketBufferNode var1 = InterfaceParent.getPacketBufferNode(ClientPacket.field2619, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(var0.length() + 1);
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(Lcj;I)Z",
		garbageValue = "-1832136832"
	)
	static boolean method492(Player var0) {
		if (Client.drawPlayerNames == 0) {
			return false;
		} else {
			boolean var1;
			if (class262.localPlayer == var0) {
				var1 = (Client.drawPlayerNames & 8) != 0;
				return var1;
			} else {
				var1 = class171.method3611();
				if (!var1) {
					boolean var2 = (Client.drawPlayerNames & 1) != 0;
					var1 = var2 && var0.isFriend();
				}

				return var1 || ClanChannel.method54() && var0.isFriendsChatMember();
			}
		}
	}
}
