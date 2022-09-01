import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -2094517607
	)
	@Export("id")
	int id;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -140486865
	)
	@Export("type")
	int type;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1181845419
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1335219741
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1839332185
	)
	@Export("x")
	int x;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 38712731
	)
	@Export("y")
	int y;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1728628647
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1660744645
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLgq;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1;
		this.type = var2;
		this.orientation = var3;
		this.plane = var4;
		this.x = var5; // L: 24
		this.y = var6;
		if (var7 != -1) {
			this.sequenceDefinition = ByteArrayPool.SequenceDefinition_get(var7);
			this.frame = 0;
			this.cycleStart = Client.cycle - 1;
			if (this.sequenceDefinition.field2181 == 0 && var9 != null && var9 instanceof DynamicObject) { // L: 30
				DynamicObject var10 = (DynamicObject)var9;
				if (this.sequenceDefinition == var10.sequenceDefinition) { // L: 32
					this.frame = var10.frame; // L: 33
					this.cycleStart = var10.cycleStart; // L: 34
					return; // L: 35
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) { // L: 38
				if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 39
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length); // L: 40
					this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]); // L: 41
				} else {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method3729()); // L: 44
				}
			}
		}

	} // L: 48

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Lhp;",
		garbageValue = "4"
	)
	@Export("getModel")
	protected final Model getModel() {
		int var2;
		if (this.sequenceDefinition != null) { // L: 51
			int var1 = Client.cycle - this.cycleStart; // L: 52
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) { // L: 53
				var1 = 100;
			}

			if (this.sequenceDefinition.isCachedModelIdSet()) { // L: 54
				var2 = this.sequenceDefinition.method3729(); // L: 68
				this.frame += var1; // L: 69
				var1 = 0; // L: 70
				if (this.frame >= var2) { // L: 71
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 72
					if (this.frame < 0 || this.frame > var2) { // L: 73
						this.sequenceDefinition = null; // L: 74
					}
				}
			} else {
				label80: {
					do {
						do {
							if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 55
								break label80;
							}

							var1 -= this.sequenceDefinition.frameLengths[this.frame]; // L: 56
							++this.frame; // L: 57
						} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 58

						this.frame -= this.sequenceDefinition.frameCount; // L: 59
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 60

					this.sequenceDefinition = null; // L: 61
				}
			}

			this.cycleStart = Client.cycle - var1; // L: 78
		}

		ObjectComposition var12 = FileSystem.getObjectDefinition(this.id); // L: 80
		if (var12.transforms != null) { // L: 81
			var12 = var12.transform();
		}

		if (var12 == null) { // L: 82
			return null;
		} else {
			int var3;
			if (this.orientation != 1 && this.orientation != 3) { // L: 85
				var2 = var12.sizeX; // L: 90
				var3 = var12.sizeY; // L: 91
			} else {
				var2 = var12.sizeY; // L: 86
				var3 = var12.sizeX; // L: 87
			}

			int var4 = (var2 >> 1) + this.x; // L: 93
			int var5 = (var2 + 1 >> 1) + this.x; // L: 94
			int var6 = (var3 >> 1) + this.y; // L: 95
			int var7 = (var3 + 1 >> 1) + this.y; // L: 96
			int[][] var8 = Tiles.Tiles_heights[this.plane]; // L: 97
			int var9 = var8[var4][var7] + var8[var4][var6] + var8[var5][var6] + var8[var5][var7] >> 2; // L: 98
			int var10 = (this.x << 7) + (var2 << 6); // L: 99
			int var11 = (this.y << 7) + (var3 << 6); // L: 100
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame); // L: 101
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "-1660311016"
	)
	public static String method1949(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) { // L: 12
			return "";
		} else if (var2 == 1) { // L: 13
			CharSequence var10 = var0[var1]; // L: 14
			return var10 == null ? "null" : var10.toString(); // L: 15 16
		} else {
			int var3 = var2 + var1; // L: 18
			int var4 = 0; // L: 19

			for (int var5 = var1; var5 < var3; ++var5) { // L: 20
				CharSequence var9 = var0[var5]; // L: 21
				if (var9 == null) { // L: 22
					var4 += 4;
				} else {
					var4 += var9.length(); // L: 23
				}
			}

			StringBuilder var8 = new StringBuilder(var4); // L: 25

			for (int var6 = var1; var6 < var3; ++var6) { // L: 26
				CharSequence var7 = var0[var6]; // L: 27
				if (var7 == null) { // L: 28
					var8.append("null");
				} else {
					var8.append(var7); // L: 29
				}
			}

			return var8.toString(); // L: 31
		}
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1905507981"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = class128.getWidgetChild(var0, var1); // L: 9251
		if (var4 != null && var4.onTargetEnter != null) { // L: 9252
			ScriptEvent var5 = new ScriptEvent(); // L: 9253
			var5.widget = var4; // L: 9254
			var5.args = var4.onTargetEnter; // L: 9255
			SceneTilePaint.runScriptEvent(var5); // L: 9256
		}

		Client.selectedSpellItemId = var3; // L: 9258
		Client.isSpellSelected = true; // L: 9259
		class282.selectedSpellWidget = var0; // L: 9260
		Client.selectedSpellChildIndex = var1; // L: 9261
		class149.selectedSpellFlags = var2; // L: 9262
		class125.invalidateWidget(var4); // L: 9263
	} // L: 9264

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "93"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (class19.friendsChatManager != null) { // L: 12002
			PacketBufferNode var1 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3017, Client.packetWriter.isaacCipher); // L: 12003
			var1.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var0)); // L: 12004
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12005
			Client.packetWriter.addNode(var1); // L: 12006
		}
	} // L: 12007

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-226908688"
	)
	static final void method1954(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : NetCache.guestClanChannel; // L: 12026
		if (var2 != null && var1 >= 0 && var1 < var2.method3046()) { // L: 12027
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 12028
			if (var3.rank == -1) {
				String var4 = var3.username.getName(); // L: 12030
				PacketBufferNode var5 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2984, Client.packetWriter.isaacCipher); // L: 12031
				var5.packetBuffer.writeByte(3 + class309.stringCp1252NullTerminatedByteSize(var4)); // L: 12032
				var5.packetBuffer.writeByte(var0); // L: 12033
				var5.packetBuffer.writeShort(var1); // L: 12034
				var5.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 12035
				Client.packetWriter.addNode(var5); // L: 12036
			}
		}
	} // L: 12029 12037
}
