package com.gorgidev.ultrahardcore.mixin.client;

import com.gorgidev.ultrahardcore.GorgiDevsUltraHardcoreClient;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ChatHud.class)
public class ChatHiderClient {
	@Inject(
			method = {
					"addMessage(Lnet/minecraft/text/Text;)V",
					"addMessage(Lnet/minecraft/text/Text;Lnet/minecraft/network/message/MessageSignatureData;Lnet/minecraft/client/gui/hud/MessageIndicator;)V"
			},
			at = @At("HEAD"),
			cancellable = true)
	private void onAddChatMessage(CallbackInfo ci) {
		if (GorgiDevsUltraHardcoreClient.isChatHidden()) {
			ci.cancel();
		}
	}
}