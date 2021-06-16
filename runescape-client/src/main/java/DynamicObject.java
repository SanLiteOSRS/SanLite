import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -560532763
	)
	@Export("id")
	int id;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1091706599
	)
	@Export("type")
	int type;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 973044997
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 950758231
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1091816693
	)
	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1250349999
	)
	@Export("y")
	int y;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 238064293
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1153448059
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLgr;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1;
		this.type = var2;
		this.orientation = var3;
		this.plane = var4;
		this.x = var5;
		this.y = var6;
		if (var7 != -1) {
			this.sequenceDefinition = WorldMapScaleHandler.SequenceDefinition_get(var7);
			this.frame = 0;
			this.cycleStart = Client.cycle - 1;
			if (this.sequenceDefinition.field1894 == 0 && var9 != null && var9 instanceof DynamicObject) {
				DynamicObject var10 = (DynamicObject)var9;
				if (var10.sequenceDefinition == this.sequenceDefinition) {
					this.frame = var10.frame;
					this.cycleStart = var10.cycleStart;
					return;
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) {
				this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length);
				this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]);
			}
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lgd;",
		garbageValue = "326918784"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.sequenceDefinition != null) {
			int var1 = Client.cycle - this.cycleStart;
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) {
				var1 = 100;
			}

			label56: {
				do {
					do {
						if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) {
							break label56;
						}

						var1 -= this.sequenceDefinition.frameLengths[this.frame];
						++this.frame;
					} while(this.frame < this.sequenceDefinition.frameIds.length);

					this.frame -= this.sequenceDefinition.frameCount;
				} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

				this.sequenceDefinition = null;
			}

			this.cycleStart = Client.cycle - var1;
		}

		ObjectComposition var12 = Tiles.getObjectDefinition(this.id);
		if (var12.transforms != null) {
			var12 = var12.transform();
		}

		if (var12 == null) {
			return null;
		} else {
			int var2;
			int var3;
			if (this.orientation != 1 && this.orientation != 3) {
				var2 = var12.sizeX;
				var3 = var12.sizeY;
			} else {
				var2 = var12.sizeY;
				var3 = var12.sizeX;
			}

			int var4 = (var2 >> 1) + this.x;
			int var5 = (var2 + 1 >> 1) + this.x;
			int var6 = (var3 >> 1) + this.y;
			int var7 = (var3 + 1 >> 1) + this.y;
			int[][] var8 = Tiles.Tiles_heights[this.plane];
			int var9 = var8[var4][var7] + var8[var4][var6] + var8[var5][var6] + var8[var5][var7] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-593608457"
	)
	public static boolean method2103() {
		ReflectionCheck var0 = (ReflectionCheck)class69.reflectionChecks.last();
		return var0 != null;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(CS)Z",
		garbageValue = "17436"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1180457180"
	)
	static final void method2099(boolean var0) {
		class233.playPcmPlayers();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.field670 && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = InterfaceParent.getPacketBufferNode(ClientPacket.field2647, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.field670 = true;
				}
			}

		}
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "([Liv;IIIZI)V",
		garbageValue = "466452320"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId == var1) {
				FontName.alignWidgetSize(var6, var2, var3, var4);
				class43.alignWidgetPosition(var6, var2, var3);
				if (var6.scrollX > var6.scrollWidth - var6.width) {
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) {
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) {
					var6.scrollY = 0;
				}

				if (var6.type == 0) {
					WorldMapLabelSize.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	}
}
