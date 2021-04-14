import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("GraphicsObject")
public final class GraphicsObject extends Renderable {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1860444775
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1442514319
	)
	@Export("id")
	int id;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -255937363
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1558185979
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -799404683
	)
	@Export("x")
	int x;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1197647983
	)
	@Export("y")
	int y;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 921468661
	)
	@Export("height")
	int height;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lkw;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1763592485
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1659206025
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("n")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0;
		this.frameCycle = 0;
		this.isFinished = false;
		this.id = var1;
		this.plane = var2;
		this.x = var3;
		this.y = var4;
		this.height = var5;
		this.cycleStart = var7 + var6;
		int var8 = Varps.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = class225.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1392688450"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) {
			this.frameCycle += var1;

			while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) {
				this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
				++this.frame;
				if (this.frame >= this.sequenceDefinition.frameIds.length) {
					this.isFinished = true;
					break;
				}
			}

		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)Lgv;",
		garbageValue = "1835906978"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = Varps.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)Lkc;",
		garbageValue = "-2021558872"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-733559314"
	)
	static final void method1913(int var0, int var1) {
		class3 var2 = var0 >= 0 ? Client.field820[var0] : IsaacCipher.field4266;
		if (var2 != null && var1 >= 0 && var1 < var2.method46()) {
			class9 var3 = (class9)var2.field27.get(var1);
			if (var3.field66 == -1) {
				String var4 = var3.field65;
				PacketWriter var5 = Client.packetWriter;
				PacketBufferNode var6 = ObjectComposition.getPacketBufferNode(ClientPacket.field2316, var5.isaacCipher);
				var6.packetBuffer.writeByte(3 + Friend.stringCp1252NullTerminatedByteSize(var4));
				var6.packetBuffer.writeByte(var0);
				var6.packetBuffer.writeShort(var1);
				var6.packetBuffer.writeStringCp1252NullTerminated(var4);
				var5.addNode(var6);
			}
		}
	}
}
