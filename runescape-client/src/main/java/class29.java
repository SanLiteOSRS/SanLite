import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
public class class29 implements Callable {
	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	final Buffer field224;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	final class31 field220;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	final class35 this$0;

	@ObfuscatedSignature(
		descriptor = "(Laq;Lnt;Laz;)V"
	)
	class29(class35 var1, Buffer var2, class31 var3) {
		this.this$0 = var1;
		this.field224 = var2;
		this.field220 = var3;
	}

	public Object call() {
		return this.field220.vmethod381(this.field224);
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "10193583"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		class397.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		class397.SpriteBuffer_xOffsets = new int[class397.SpriteBuffer_spriteCount];
		class26.SpriteBuffer_yOffsets = new int[class397.SpriteBuffer_spriteCount];
		Canvas.SpriteBuffer_spriteWidths = new int[class397.SpriteBuffer_spriteCount];
		Clock.SpriteBuffer_spriteHeights = new int[class397.SpriteBuffer_spriteCount];
		class126.SpriteBuffer_pixels = new byte[class397.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - class397.SpriteBuffer_spriteCount * 8;
		class397.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class244.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < class397.SpriteBuffer_spriteCount; ++var3) {
			class397.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class397.SpriteBuffer_spriteCount; ++var3) {
			class26.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class397.SpriteBuffer_spriteCount; ++var3) {
			Canvas.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class397.SpriteBuffer_spriteCount; ++var3) {
			Clock.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class397.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		class397.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			class397.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (class397.SpriteBuffer_spritePalette[var3] == 0) {
				class397.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < class397.SpriteBuffer_spriteCount; ++var3) {
			int var4 = Canvas.SpriteBuffer_spriteWidths[var3];
			int var5 = Clock.SpriteBuffer_spriteHeights[var3];
			int var6 = var4 * var5;
			byte[] var7 = new byte[var6];
			class126.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var10 * var4] = var1.readByte();
					}
				}
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2077147833"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0;
		if (class14.garbageCollector == null || !class14.garbageCollector.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
					if (var2.isValid()) {
						class14.garbageCollector = var2;
						GameEngine.garbageCollectorLastCheckTimeMs = -1L;
						GameEngine.garbageCollectorLastCollectionTime = -1L;
					}
				}
			} catch (Throwable var11) {
			}
		}

		if (class14.garbageCollector != null) {
			long var9 = ClientPacket.currentTimeMillis();
			long var3 = class14.garbageCollector.getCollectionTime();
			if (-1L != GameEngine.garbageCollectorLastCollectionTime) {
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
				if (var7 != 0L) {
					var0 = (int)(100L * var5 / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3;
			GameEngine.garbageCollectorLastCheckTimeMs = var9;
		}

		return var0;
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2119346046"
	)
	static final void method378(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : AttackOption.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method49()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.name;
				PacketWriter var5 = Client.packetWriter;
				PacketBufferNode var6 = InterfaceParent.getPacketBufferNode(ClientPacket.field2583, var5.isaacCipher);
				var6.packetBuffer.writeByte(3 + class44.stringCp1252NullTerminatedByteSize(var4));
				var6.packetBuffer.writeByte(var0);
				var6.packetBuffer.writeShort(var1);
				var6.packetBuffer.writeStringCp1252NullTerminated(var4);
				var5.addNode(var6);
			}
		}
	}
}
