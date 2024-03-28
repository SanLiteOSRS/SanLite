import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
public class class1 implements Callable {
	@ObfuscatedName("ax")
	public static short[][] field6;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	static IndexedSprite field3;
	@ObfuscatedName("nt")
	@ObfuscatedGetter(
		intValue = 136404261
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	final Buffer field4;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	final class3 field1;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Law;Lur;Lat;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1; // L: 47
		this.field4 = var2; // L: 48
		this.field1 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field1.vmethod14(this.field4); // L: 54
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIS)Lcn;",
		garbageValue = "128"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 39
		return var2.getMessage(var1); // L: 40
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "2142505940"
	)
	static final void method7(int var0, int var1, int var2) {
		if (WorldMapLabelSize.cameraX < var0) { // L: 4078
			WorldMapLabelSize.cameraX = (var0 - WorldMapLabelSize.cameraX) * class20.field91 / 1000 + WorldMapLabelSize.cameraX + Renderable.field2716; // L: 4079
			if (WorldMapLabelSize.cameraX > var0) { // L: 4080
				WorldMapLabelSize.cameraX = var0;
			}
		}

		if (WorldMapLabelSize.cameraX > var0) { // L: 4082
			WorldMapLabelSize.cameraX -= (WorldMapLabelSize.cameraX - var0) * class20.field91 / 1000 + Renderable.field2716; // L: 4083
			if (WorldMapLabelSize.cameraX < var0) { // L: 4084
				WorldMapLabelSize.cameraX = var0;
			}
		}

		if (MouseHandler.cameraY < var1) { // L: 4086
			MouseHandler.cameraY = (var1 - MouseHandler.cameraY) * class20.field91 / 1000 + MouseHandler.cameraY + Renderable.field2716; // L: 4087
			if (MouseHandler.cameraY > var1) { // L: 4088
				MouseHandler.cameraY = var1;
			}
		}

		if (MouseHandler.cameraY > var1) { // L: 4090
			MouseHandler.cameraY -= (MouseHandler.cameraY - var1) * class20.field91 / 1000 + Renderable.field2716; // L: 4091
			if (MouseHandler.cameraY < var1) { // L: 4092
				MouseHandler.cameraY = var1;
			}
		}

		if (class193.cameraZ < var2) { // L: 4094
			class193.cameraZ = (var2 - class193.cameraZ) * class20.field91 / 1000 + class193.cameraZ + Renderable.field2716; // L: 4095
			if (class193.cameraZ > var2) { // L: 4096
				class193.cameraZ = var2;
			}
		}

		if (class193.cameraZ > var2) { // L: 4098
			class193.cameraZ -= (class193.cameraZ - var2) * class20.field91 / 1000 + Renderable.field2716; // L: 4099
			if (class193.cameraZ < var2) { // L: 4100
				class193.cameraZ = var2;
			}
		}

	} // L: 4102

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(Ldi;IILiu;I)V",
		garbageValue = "-1480308235"
	)
	static final void method11(Player var0, int var1, int var2, class233 var3) {
		int var4 = var0.pathX[0]; // L: 9221
		int var5 = var0.pathY[0]; // L: 9222
		int var6 = var0.transformedSize(); // L: 9223
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) { // L: 9224
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) { // L: 9225
				int var7 = Client.field629.method4446(var4, var5, var0.transformedSize(), class60.method1132(var1, var2), Client.collisionMaps[var0.plane], true, Client.field815, Client.field655); // L: 9226
				if (var7 >= 1) { // L: 9227
					for (int var8 = 0; var8 < var7 - 1; ++var8) { // L: 9228
						var0.method2344(Client.field815[var8], Client.field655[var8], var3);
					}

				}
			}
		}
	} // L: 9229
}
